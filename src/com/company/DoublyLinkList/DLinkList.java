package com.company.DoublyLinkList;

/**
 * Created by macbook on 6/13/17.
 */

class DNode{
    DNode next;
    DNode previous;
    int data;
    public DNode(int data){
        this.data = data;
        this.next=null;
        this.previous=null;
    }
}
public class DLinkList {
    DNode head;
    DNode tail;
    DNode current;

    public void insertAtHead(int data){
        if(head==null){
            head = new DNode(data);
        }else{
            current = head;
            head = new DNode(data);
            head.next = current;
            current.previous = head;
        }

    }

    public void insertAtTail(int data){
        if(head==null){
            head = new DNode(data);
        }else{
            current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next = new DNode(data);
            current = current.next.previous;

        }

    }

    public void display(){
        DNode current = head;
        System.out.println("Forward: ");
        while(current != null ) {
            System.out.print("-->"+current.data);
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        DLinkList dll = new DLinkList();
      /*  dll.insertAtHead(10);
        dll.insertAtHead(20);
        dll.insertAtHead(30);
        dll.insertAtHead(40);

        dll.display();*/

        dll.insertAtTail(10);
        dll.insertAtTail(20);
        dll.insertAtTail(30);
        dll.insertAtTail(40);

        dll.display();

    }
}
