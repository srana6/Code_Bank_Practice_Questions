package com.company.LinkList;

import java.util.*;

/**
 * Created by macbook on 6/15/17.
 */

class Node6{
    int data;
    Node6 next;

    public Node6(int data){
        this.data = data;
    }
}

public class RemoveDuplicateItemLinkList {

    Node6 head;
    Node6 current;

    public void append(int value){
        if(head==null){
            head=new Node6(value);
        }
        else{
            current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=new Node6(value);
        }
    }

    public void displayList(Node6 head){
        Node6 current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println();
    }


    private Node6 removeDuplicateItemsLinkList() {
        Map<Integer,Integer> hm = new LinkedHashMap<>();
        Node6 newHead = null;
        Node6 newCurrent = null;
        int count=1;
        Node6 current = head;
        while(current!=null){
            int data = current.data;
            System.out.println(data);
            if(!hm.containsKey(data)){
                hm.put(data,count);
            }else{
                hm.put(data,hm.get(data)+1);
            }
            current = current.next;
        }
        System.out.println(hm.toString());

        for(int val : hm.keySet()){
            int key = val;
            int valueOfKey = hm.get(key);
            if(valueOfKey==1){
                if(newHead==null){
                    newHead=new Node6(key);
                }
                else{
                    newCurrent=newHead;
                    while(newCurrent.next!=null){
                        newCurrent=newCurrent.next;
                    }
                    newCurrent.next=new Node6(key);
                }
            }
        }
        return newHead;
    }

    public static void main(String[] args) {
        RemoveDuplicateItemLinkList rnl = new RemoveDuplicateItemLinkList();
        rnl.append(1);
        rnl.append(2);
        rnl.append(3);
        rnl.append(3);
        rnl.append(4);
        rnl.append(4);
        rnl.append(5);

        Node6 head = rnl.removeDuplicateItemsLinkList();
        rnl.displayList(head);


    }

}
