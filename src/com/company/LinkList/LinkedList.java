package com.company.LinkList;

/**
 * Created by macbook on 3/26/17.
 */
/*
 * Java class to represent linked list data structure.
 */
class Node{
    Node next;
    int data;

    public Node(int data){
        this.data=data;
    }

}
/*
LinkedList class to make node
 */
public class LinkedList {
    Node head;
    Node current;

    private LinkedList(){

    }

    /**
     *
     * Create a List by appending values
     */

    public void append(int value){
        if(head==null){
            head=new Node(value);
        }
        else{
            current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=new Node(value);
        }
    }

    /**
     *
     * Prepend the node in the front
     */
    public void prepend(int value){
        Node newHead;
        newHead = new Node(value);
        newHead.next=head;
        head=newHead;
    }

    /**
     *
     * Delete a node
     */
    public void deleteNode(int delValue){
        current=head;
        if(head.data==delValue){
            head=head.next;
        }
        while(current.next!=null){
            if(current.next.data==delValue){
                current.next=current.next.next;
                return;
            }
            current=current.next;
        }
    }

    /**
     * Reverse a Link List
     */
    public void reverseLinkList(){
        while(current.next!=null){
            current=current.next;
        }
        current.next=head;
    }

    /**
     * Find the middle value in the link list
     */
    public void findMiddleElement(){
        System.out.println();
        Node current=head;
        Node slow=current;
        Node fast=current;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println(slow.data);
    }

    /**
     *
     *  Inserting the element at a given position in a link list
     */
    public void insertNodeAtPosition(int pos){
        int count =1;
        current = head;
        Node ahead;
        while(count<pos){
            current=current.next;
            count++;
        }

        ahead = current.next;
        current.next = new Node(35);
        current = current.next;
        current.next = ahead;
    }

    /**
     * Display the data of the link list
     */
    public void display(){
        System.out.println();
        current=head;
        while(current!=null){
            System.out.print(current.data);
            System.out.print("->");
            current=current.next;

        }
        System.out.println();
    }



    public static void main(String[] args){
        LinkedList ll =new LinkedList();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.append(50);

        System.out.println("The original Link List is:::");
        ll.display();

        System.out.println("The middle element of the link list is:::");
        ll.findMiddleElement();

        System.out.println("New List after inserting an element on a specific position");
        ll.insertNodeAtPosition(3);

        ll.display();
    }
}

