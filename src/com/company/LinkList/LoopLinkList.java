package com.company.LinkList;

/**
 * Created by macbook on 3/29/17.
 */
class Node1{
    Node1 next;
    int data;

    public Node1(int data){
        this.data=data;
    }

}
public class LoopLinkList {
    Node1 head;
    Node1 current;
    public void createLinkList(int value){
        if(head==null){
            System.out.println("Creating first node of LinkList");
            head = new Node1(value);
            System.out.println("First node of link list is created");
        }
        else{
            //Link list exist we are appending new nodes to it
            current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=new Node1(value);
        }
    }

    public void deleteNode(int delValue){
        current=head;
        if(head.data==delValue){
            head=current.next;
        }
        else{
            while(current.next!=null){
                if(current.next.data==delValue){
                    current.next=current.next.next;
                    return;
                }
                current=current.next;
            }
        }
    }

    public void detectLoop(){
        System.out.println();
        Node1 slow = head;
        Node1 fast = head.next;

        if(head==null){
            System.out.println("Link List empty");
        }

        while(fast!=null && slow!=null && fast.next!=null ){
            if(slow == fast){
                System.out.println("Contains Cycle");
            }
            fast=fast.next.next;
            slow=slow.next;
        }

        System.out.println("No Cycle");
    }

    public void displayLinkList(){
        System.out.println();
        current=head;
        while(current!=null){
            System.out.print(current.data);
            System.out.print("->");
            current=current.next;
        }
    }

    public static void main(String[] args){
        LoopLinkList ll =new LoopLinkList();
        ll.createLinkList(10);
        ll.createLinkList(20);
        ll.createLinkList(30);

        ll.displayLinkList();

        ll.deleteNode(10);

        ll.displayLinkList();

        ll.detectLoop();
    }
}
