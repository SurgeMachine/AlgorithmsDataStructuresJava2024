package LinkedList;

public class Main {
    public static void main(String[] args) {
        //Example 1
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);
        ListNode head_0 = Solution.mergeTwoLists(head1, head2);
        while (head_0 != null) {
            System.out.println(head_0.val);
            head_0 = head_0.next;
        }
        System.out.println('\n');
        //Example 2
        ListNode head3 = new ListNode();
        ListNode head4 = new ListNode();
        ListNode head_1 = Solution.mergeTwoLists(head3, head4);
        while (head_1 != null) {
            System.out.println(head_1.val);
            head_1 = head_1.next;
        }
        System.out.println('\n');
        //Example 3
        ListNode head5 = new ListNode();
        ListNode head6 = new ListNode(0);
        ListNode head_2 = Solution.mergeTwoLists(head5, head6);
        while (head_2 != null) {
            System.out.println(head_2.val);
            head_2 = head_2.next;
        }
    }
}
