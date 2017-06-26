package com.company.LinkList;

/**
 * Created by macbook on 6/15/17.
 */

/**
 * Remove nth node from the end of the list
 */
class Node5{
    int data;
    Node5 next;

    public Node5(int data){
        this.data = data;
    }
}
public class RemoveNthNodeLinkList {
    Node5 head;
    Node5 current;

    public void append(int value){
        if(head==null){
            head=new Node5(value);
        }
        else{
            current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=new Node5(value);
        }
    }

    public void displayList(Node5 head){
        Node5 current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println();
    }

    /***
     * Main Logic of removing nth node from the end
     *
     */

    public Node5 removeNthNodeFromTheEnd(int n){
        Node5 current = head;
        int size=1;
        int count=1;

        /**
         * Calculate the size of the link list
         */
        while(current!=null && current.next!=null){
            current = current.next;
            size+=1;
        }

        System.out.println("The size of the list is::"+size);

        /**
         * if the node to remove is the first node i.e n == size
         * Shift head ahead and return the head
         */
        if(n==size){
            head = head.next;
            return head;
        }
        current = head;

        /**
         * If node to be removed is the last one, take current pointer to one node
         * before the last node and set the second last node point to null
         */
        if(n==0){
            while(count<size-1){
                current = current.next;
                count+=1;
            }
            current.next = null;
            return head;
        }

        /**
         * For any other middle element just subtract the n from the size
         * Take current point till that nth node
         * delete the next node by current.next = current.next.next;
         * return the head
         */
        int traversal  = (size - n);

        current = head;
        while(count<traversal){
            current = current.next;
            count++;
        }

        current.next = current.next.next;
        System.out.println(current.data);
        displayList(head);
        return head;
    }

    public static void main(String[] args) {
        RemoveNthNodeLinkList rnl = new RemoveNthNodeLinkList();
        rnl.append(1);
        rnl.append(2);
        rnl.append(3);
        rnl.append(4);
        rnl.append(5);

        Node5 head = rnl.removeNthNodeFromTheEnd(0);
        rnl.displayList(head);


    }

}
