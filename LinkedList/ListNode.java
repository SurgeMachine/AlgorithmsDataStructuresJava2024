package LinkedList;

public class ListNode {
    final int val;
    ListNode next;
    ListNode() { val = 0; }
    ListNode(int val) { this.val = val; next = null;}
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    @Override
    public String toString(){
        ListNode head = this;
        String s = "";
        while (head != null) {
            s += head.val + " ";
            head = head.next;
        }
        return s;
    }
}