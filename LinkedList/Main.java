package LinkedList;

public class Main {
    public static void main(String[] args) {
        //Example 1
        final ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(4);
        final ListNode head2 = new ListNode(1);
        head2.next = new ListNode(3);
        head2.next.next = new ListNode(4);
        final ListNode head_0 = Solution.mergeTwoLists(head1, head2);
        System.out.println(head_0.toString());
        System.out.println('\n');
        //Example 2
        final ListNode head3 = new ListNode();
        final ListNode head4 = new ListNode();
        final ListNode head_1 = Solution.mergeTwoLists(head3, head4);
        System.out.println(head_1.toString());
        System.out.println('\n');
        //Example 3
        final ListNode head5 = new ListNode();
        final ListNode head6 = new ListNode(0);
        final ListNode head_2 = Solution.mergeTwoLists(head5, head6);
        System.out.println(head_2.toString());
    }
}
