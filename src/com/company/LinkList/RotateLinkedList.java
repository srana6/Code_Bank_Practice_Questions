package com.company.LinkList;

/**
 * Created by macbook on 5/7/17.
 */

class NodeOfLinkList1{
    NodeOfLinkList1 next;
    int data;
    public NodeOfLinkList1(int data){
        this.data=data;
    }

}



public class RotateLinkedList {

    NodeOfLinkList1 head=null;
    NodeOfLinkList1 current=null;


    public void makeNodes(int data) {
        if (head == null) {
            head= new NodeOfLinkList1(data);
        } else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            //when reach null append a new node to end node
            current.next = new NodeOfLinkList1(data);

        }
    }

    public void rotateLinkedList(int k){
        NodeOfLinkList1 current=head;
        int len=1;

        //1. Calculate the length of the linked list
        while(current.next!=null){
            len+=1;
            current=current.next;
        }
        System.out.println("The length of link list is:: "+len);

        //2. Make it Circular
        current.next=head;

        k=k%len;
        /*3. Rotate the list i.e traverse one node before the break point
        In this case 1->2->3->4->5 , till 3 node
         */
        for(int i=0;i<len-k;i++){
            current=current.next;

        }

        //4. update the head
        head=current.next;

        //5. Break the circle
        current.next=null;
    }



    public void displayLinkedList() {
        //NodeOfLinkList head = null;
        NodeOfLinkList1 current = head;
        while (current != null) {
            System.out.print(current.data + "->");
            current = current.next;

        }
    }





    public static void main(String[] args) {
        RotateLinkedList rll = new RotateLinkedList();
        rll.makeNodes(1);
        rll.makeNodes(2);
        rll.makeNodes(3);
        rll.makeNodes(4);
        rll.makeNodes(5);



        rll.displayLinkedList();

        rll.rotateLinkedList(2);

        rll.displayLinkedList();

    }

}

