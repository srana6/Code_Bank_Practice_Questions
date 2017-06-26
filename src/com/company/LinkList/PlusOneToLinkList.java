package com.company.LinkList;

/**
 * Created by macbook on 6/15/17.
 */
class Node8{
    int data;
    Node8 next;

    public Node8(int data){
        this.data = data;
    }
}
public class PlusOneToLinkList {

    Node8 head;
    Node8 current;

    public void append(int value){
        if(head==null){
            head=new Node8(value);
        }
        else{
            current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=new Node8(value);
        }
    }

    public Node8 reverseLinkedList(Node8 head){
        Node8 current = head;
        Node8 previous=null;
        Node8 next = null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;

        return head;
    }

    /**
     * Case 1: 1->2->3 i.e no 9, there for just add one to last digit
     *
     * Case 2: 1->9->9 i.e 2 nine, add 1 to first item and make rest 0
     *
     * Case 3: 9->9->9 i.e all nine, add a dummy 1 node attach to head make all other node value 0
     */
    private Node8 plusOneToList() {
        Node8 current = head;
        int count9=0;
        int size=1;
        while(current!=null && current.next!=null){
            if(current.data==9){
                count9+=1;
            }
            current = current.next;

            size++;
        }
        System.out.println(size);

        if(current.data==9){
            count9+=1;
        }

        /**
         * Case 1 : if last digit is not 9
         */
        if(current.data!=9){
            current=head;
            while(current!=null && current.next!=null){
                current = current.next;
            }
            current.data=current.data+1;

            return head;
        }else if(current.data==9){
            Node8 headNew = reverseLinkedList(head);
            current = headNew;
            while(current!=null && current.next!=null){
                if(current.data==9){
                    current.data = 0;
                }else{
                    current.data=current.data+1;
                }
                current = current.next;
            }
            Node8 head = reverseLinkedList(headNew);
            return head;
        }

        /**
         * Case 2: When all digits are 9 in the list
         */
        if(count9==size){
            current=head;
            Node8 dummy = new Node8(1);
            dummy.next=head;
            head = dummy;
            while(current!=null && current.next!=null){
                current.data=0;
                current = current.next;
            }
            current.data=0;
            return head;
        }



        return null;
    }

    public void display(Node8 head){
        System.out.println();
        current=head;
        while(current!=null){
            System.out.print(current.data);
            System.out.print("->");
            current=current.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        PlusOneToLinkList pll = new PlusOneToLinkList();
        pll.append(1);
        pll.append(8);
        pll.append(9);

        Node8 head = pll.plusOneToList();

        pll.display(head);
    }


}
