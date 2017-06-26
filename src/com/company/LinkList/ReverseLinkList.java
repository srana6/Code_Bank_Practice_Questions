package com.company.LinkList;

/**
 * Created by macbook on 5/6/17.
 */
class NodeOfLinkList{
    NodeOfLinkList next;
    int data;
    public NodeOfLinkList(int data){
        this.data=data;
    }

}
public class ReverseLinkList {
    NodeOfLinkList head=null;
    NodeOfLinkList current=null;


    public void makeNodes(int data) {
        if (head == null) {
            head= new NodeOfLinkList(data);
        } else {
            current = head;
            while (current.next != null) {
                current = current.next;
            }
            //when reach null append a new node to end node
            current.next = new NodeOfLinkList(data);

        }
    }



    public void displayLinkedList(){
         //NodeOfLinkList head = null;
         NodeOfLinkList current = head;
         while(current!=null){
             System.out.print(current.data+"->");
             current=current.next;

         }
    }




    public void reverseLinkedList(){
        System.out.println();
        NodeOfLinkList current = head;
        NodeOfLinkList previous=null;
        NodeOfLinkList next = null;
        while(current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;
    }

    public void deleteNodeLinkedList(int data){
        System.out.println();
        NodeOfLinkList previous=null;
        NodeOfLinkList current=head;
        if(head.data==data && head.next==null){
            return;
        }
        if(head.data==data){
            head=head.next;
        }

        while(current!=null){
            if(current.data==data){
                previous.next=current.next;
            }
            previous=current;
            current=current.next;
        }
    }

    public void appendInFront(int data){
        System.out.println();
        NodeOfLinkList current = head;
        NodeOfLinkList previous=null;
        previous = new NodeOfLinkList(data);
        previous.next=current;
        head=previous;
    }



    public static void main(String[] args) {
        ReverseLinkList reverseLinkList = new ReverseLinkList();
        reverseLinkList.makeNodes(1);
        reverseLinkList.makeNodes(2);
        reverseLinkList.makeNodes(3);
        reverseLinkList.makeNodes(4);



        reverseLinkList.displayLinkedList();


        //reverse link list
        reverseLinkList.reverseLinkedList();
        reverseLinkList.displayLinkedList();


        //delete a node
      //  reverseLinkList.deleteNodeLinkedList(1);
       // reverseLinkList.displayLinkedList();

       // reverseLinkList.appendInFront(0);
       // reverseLinkList.displayLinkedList();
    }
}
