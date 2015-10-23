public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        while(head.next!=null && head.val == head.next.val){
            head.next = head.next.next;
        }
        head.next = deleteDuplicates(head.next);
        return head;
    }
    
}
