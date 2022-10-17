/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        //1st we find all the the base cases 
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        
        //declare an emptry listnode and listnode head
        ListNode res = new ListNode();
        ListNode p = res;
        
        while(list1 != null && list2 !=null){
            if(list1.val < list2.val){
                res.next =list1;
                list1 = list1.next;
            }else{
                res.next = list2;
                list2 = list2.next;
            }
            res= res.next;
        }
        // when we fished all conditison above, it will only have list 1 become null or list 2 become null
        if(list1 != null){
            res.next = list1;
        }
            if(list2 !=null){
               res.next = list2;
            }
         return p.next;
    }
}
