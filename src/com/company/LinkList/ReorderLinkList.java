package com.company.LinkList;

/**
 * Created by macbook on 6/14/17.
 */

class Node3{
    Node3 next;
    int data;

    public Node3(int data){
        this.data = data;
    }
}
public class ReorderLinkList {
    Node3 head;
    Node3 current;
    public void append(int value){
        if(head==null){
            head=new Node3(value);
        }
        else{
            current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=new Node3(value);
        }
    }

    public Node3 reorderList(){
        Node3 slow = head;
        Node3 fast = head;
        Node3 l1 = head;
        Node3 prev=null;

        /**
         * Take pointer till the middle element
         */
        while(fast!=null&&fast.next!=null){
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;

        }

        /**
         * Reverse the half after middle, we have to list L1 and L2(reverse)
         */
        prev.next = null;
        Node3 l2 = reverse(slow);

        /**
         * Merge the two list
         */

       Node3 headTemp =  mergeLists(l1, l2);

        return headTemp;

    }

    /**
     * method to reverse second list
     *
     */
    Node3 reverse(Node3 head) {
        Node3 curr = head;
        Node3 prev = null;
        Node3 next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    /**
     *
     * method to merge two list
     */
    Node3 mergeLists(Node3 l1, Node3 l2) {
        Node3 head = l1;
        Node3 current1=null;
        Node3 current2=null;



        while(l1!=null && l2!=null){
            current1 = l1;

            current2 = l2;

            l1=l1.next;

            l2=l2.next;

            current1.next = current2;

            current2.next = l1;

        }
        if(l1==null){
            current2.next = l2;

        }

       return head;
    }

    public void displayList(Node3 head){
        Node3 current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ReorderLinkList rll = new ReorderLinkList();
        rll.append(1);
        rll.append(2);
        rll.append(3);
        rll.append(4);
        rll.append(5);
        rll.append(6);
        rll.append(7);


        Node3 head = rll.reorderList();

        rll.displayList(head);

    }
}
