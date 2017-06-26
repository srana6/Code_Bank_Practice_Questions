package com.company.LinkList;

import java.util.Stack;

/**
 * Created by macbook on 5/23/17.
 */

class NodeofLinkList2{
    NodeofLinkList2 next;
    public int data;
    public void NodeofLinkList2(int data){
        this.data=data;
    }
}
public class PalindromeLinkList {

    /*
   1->4->4->1->null
   */
    public boolean isPalindrome(NodeofLinkList2 head) {
        NodeofLinkList2 slow=head;
        NodeofLinkList2 fast=head;
        Stack<Integer> s = new Stack<>();
        while(fast!=null && fast.next!=null){
            s.add(slow.data);
            slow=slow.next;
            fast=fast.next.next;
        }
        //for odd case
        if(fast!=null){
            slow=slow.next;
        }
        while(slow!=null){
            if(slow.data!=s.pop().intValue()){
                return false;
            }
            slow=slow.next;
        }
        return true;
    }


}
