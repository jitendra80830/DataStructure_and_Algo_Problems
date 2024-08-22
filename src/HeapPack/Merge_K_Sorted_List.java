package HeapPack;

import LinklistPack.LinkList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Merge_K_Sorted_List {

    public class ListNode {
      int val;
      ListNode next;
       public ListNode() {

      }
     public ListNode(int val) {
          this.val = val;
      }
      public ListNode(int val, ListNode next) {
          this.val = val;
          this.next = next;
      }
  }
    class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            if(lists.length == 0){
                return null;
            }
            PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
                @Override
                public int compare(ListNode o1, ListNode o2) {
                    return o1.val - o2.val;
                }
            });
            ListNode ans = new ListNode(-100000); // new node
            ListNode  temp = ans; //copy address from ans in temp , 1st node stored (-100000)
            for(int i=0;i<lists.length;i++){
                if (lists[i]!=null)
                pq.add(lists[i]);//add 1st element in pq  from list
            }
            while (!pq.isEmpty()){
                ListNode rv = pq.remove(); // remove from pq
                ans.next = rv; // after removing add in linkedList using next
                ans = ans.next; // adding next element

                if(rv.next!=null){
                    pq.add(rv.next) ; // if rv's next is there then add priority Queue
                }

            }
            return temp.next;


        }
    }
}
