package LinkedList;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
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