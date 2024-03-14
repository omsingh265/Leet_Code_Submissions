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
    public ListNode removeZeroSumSublists(ListNode head) {
        int pfSum = 0;
        ListNode dummyNode = new ListNode(0);
        Map<Integer, ListNode> map = new HashMap<>();
        dummyNode.next = head;
        map.put(0,dummyNode);
        
        while(head !=null){
            pfSum += head.val;
            if(!map.containsKey(pfSum)){
                map.put(pfSum,head);
            }
            else{
                ListNode start = map.get(pfSum);
                ListNode current = start;
                int total = pfSum;
                while(current != head){
                    current = current.next;
                    total += current.val;
                    if(current != head){
                        map.remove(total);
                    }
                }
                start.next = head.next;
            }
            head = head.next;
        }
        return dummyNode.next;
    }
}