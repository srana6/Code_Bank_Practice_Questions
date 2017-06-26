package com.company.LinkList;

/**
 * Created by macbook on 6/15/17.
 */

class Node7{
    Node7 next;
    int data;

    public Node7(int data){
        this.data = data;
    }
}
public class ReverseLinkListMToN {

    Node7 head;
    Node7 current;
    public void append(int value){
        if(head==null){
            head=new Node7(value);
        }
        else{
            current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=new Node7(value);
        }
    }

    public void displayList(Node7 head){
        Node7 current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println();
    }

    private Node7 reverseMtoNPositionList(int m, int n) {

        if(head == null) return null;

        Node7 prev = null;
        Node7 start = null;
        Node7 ahead = null;
        Node7 tempPrev = null;
        Node7 tempStart = null;

        /**
         * Create a dummy node
         */
        Node7 dummy = new Node7(0);

        /**
         * attach that dummy node to front of the list and prev to dummy node
         */

        dummy.next=head;
        prev=dummy;

        /**
         * start taking pre before the m
         */
        for(int i=1;i<=m-1;i++){
            prev = prev.next;
        }

        /**
         * Assign start the value of prev.next i.e attach start pointer to the m position
         */
        tempPrev = prev;
        start = prev.next;
        tempStart=start;


        /**
         * Start reversing the string till n-m
         */

        for(int i=m;i<=n;i++){

           /* q2 = cur2.next; ahead = start.next;
            cur2.next = pre2; start.next = prev;
            pre2 = cur2;      prev = start;
            cur2 = q2;     start = ahead;*/


            ahead = start.next;
            start.next = prev;
            prev=start;
            start=ahead;
        }

        /**
         * Connect to the reverse list
         */
        tempPrev.next=prev;
        tempStart.next=start;

        return dummy.next;
    }

    public static void main(String[] args) {

        ReverseLinkListMToN rll = new ReverseLinkListMToN();
        rll.append(1);
        rll.append(2);
        rll.append(3);
        rll.append(4);
        rll.append(5);

        int m =2;
        int n =4;
        Node7 head = rll.reverseMtoNPositionList(m,n);
        rll.displayList(head);

    }
}
