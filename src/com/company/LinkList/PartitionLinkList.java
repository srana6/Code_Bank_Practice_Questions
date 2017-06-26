package com.company.LinkList;

/**
 * Created by macbook on 6/9/17.
 */

/*
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.
 */

class Node2{
    Node2 next;
    int data;
    public Node2(int data){
        this.data=data;
    }
}
public class PartitionLinkList {

    public PartitionLinkList(){

    }

    Node2 head;
    Node2 curr;

    public void append(int value){
        if(head==null){
            head=new Node2(value);
        }
        else{
            curr=head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=new Node2(value);
        }
    }

    public void partitionList(int x){
        Node2 dummyList1 = new Node2(0);
        Node2 dummyList2 = new Node2(0);

        Node2 curr1 = dummyList1;
        Node2 curr2 = dummyList2;
        Node2 curr = head;
        while(curr!=null){
            if(curr.data<x){
                //curr1.next = new Node2(curr.data);
                curr1.next=curr;
                curr1=curr1.next;
            }else{
                curr2.next=curr;
                curr2=curr2.next;
            }
            curr=curr.next;
        }
        curr2.next=null; //very important step
        curr1.next = dummyList2.next;

    }

    public void display(){
        System.out.println();
        curr=head;
        while(curr!=null){
            System.out.print(curr.data);
            System.out.print("->");
            curr=curr.next;

        }
    }

    public static void main(String[] args) {
        PartitionLinkList pl = new PartitionLinkList();
        pl.append(1);
        pl.append(4);
        pl.append(3);
        pl.append(2);
        pl.append(5);
        pl.append(2);

        pl.partitionList(3);

        pl.display();

    }
}
