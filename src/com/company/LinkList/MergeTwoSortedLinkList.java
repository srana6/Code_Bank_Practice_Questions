package com.company.LinkList;

/**
 * Created by macbook on 6/15/17.
 */
class Node4{
    Node4 next;
    int data;
    public Node4(int data){
        this.data=data;
    }
}
public class MergeTwoSortedLinkList {
    Node4 head1;
    Node4 current1;

    Node4 head2;
    Node4 current2;

    Node4 head3;

    /**
     *
     * Create a List by appending values
     */

    public  Node4 appendList1(int[] data){
        for(int i=0;i<data.length;i++){
            if(head1==null){
                head1=new Node4(data[i]);
            }
            else{
                current1=head1;
                while(current1.next!=null){
                    current1=current1.next;
                }
                current1.next=new Node4(data[i]);
            }

        }

        return head1;
    }


    /**
     * Display the data of the link list
     */
    public void displayLinkList1(Node4 head1){
        System.out.println();
        current1=head1;
        while(current1!=null){
            System.out.print(current1.data);
            System.out.print("->");
            current1=current1.next;

        }
        System.out.println();
    }


    public static Node4 mergeTwoSortedList(Node4 head1, Node4 head2){
        Node4 head3=null;
        Node4 current3 = null;

        /**
         * If head1 i.e List1 is empty then List2 is already sorted hence return that OR
         * If head2 i.e List2 is empty then List1 is already sorted hence return that
         */
        if(head1==null){
            return head2;
        }else if(head2==null){
            return head1;
        }
        /**
         * Compare the first element of the list and put new head i.e Head3 there, also add the current
         * pointer to the new head
         */
        if(head1!=null && head2!=null){
            if(head1.data<=head2.data){
                head3 = head1;
                head1 = head1.next;
            }else if( head2.data<=head1.data){
                head3 = head2;
                head2 = head2.next;
            }
            current3 = head3;
        }
        /**
         * Traverse till one of the list out of List1 and List2 are empty
         * Compare the values of head1 data and head2 data
         * Update current3 pointer
         * Increment head1 and head2 pointer accordingly
         */
        while(head1!=null && head2!=null){
            if(head1.data<=head2.data){

                current3.next = head1;
                current3=head1;
                head1 = head1.next;

            }else if(head2.data<=head1.data){
                current3.next = head2;
                current3=head2;
                head2 = head2.next;
            }
        }
        /**
         * which ever list finished first, i.e if List1 is shorter and finished first
         * then add rest of the list from pointer head2 to the current.next pointer
         * if list2 is finished i.e it was shorter add rest of the List1 , head1 pointer to current.next
         * pointer.
         */
        if(head1==null){
            current3.next=head2;
        }else if(head2==null){
            current3.next=head1;
        }
        return head3;
    }

    public void displayLinkListMergeList(){
        System.out.println();
        Node4 current3=head3;
        while(current3!=null){
            System.out.print(current3.data);
            System.out.print("->");
            current3=current3.next;

        }
        System.out.println();
    }


    public static void main(String[] args) {
        MergeTwoSortedLinkList ll1 =new MergeTwoSortedLinkList();
        int [] ar ={1};
        Node4 head1 = ll1.appendList1(ar);

        ll1.displayLinkList1(head1);

        MergeTwoSortedLinkList ll2 =new MergeTwoSortedLinkList();
        int [] ar1 ={1};
        Node4 head2 = ll2.appendList1(ar1);

        ll2.displayLinkList1(head2);


        Node4 head3 = mergeTwoSortedList(head1, head2);
        ll2.displayLinkList1(head3);

    }
}
