
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
public class AddTwoNumbers {

    public static void main(String[] args) {

        ListNode n1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode n2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        
        ListNode result = addTwoNumbers(n1, n2);
        while(result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String val1 = "";
        String val2 = "";
        
        while (l1 != null) {
            System.out.println(l1.val);
            val1 = String.valueOf(l1.val) + val1;
            l1 = l1.next;
        }
        
        while (l2 != null) {
            System.out.println(l2.val);
            val2 = String.valueOf(l2.val) + val2;
            l2 = l2.next;
        }

        int sum = 0;
        sum = Integer.valueOf(val1) + Integer.valueOf(val2);
        
        String strSum = String.valueOf(sum);
        System.out.println(strSum);

        ListNode result = new ListNode(strSum.charAt(strSum.length() - 1));
        for (int i = strSum.length() - 2; i >= 0; i--) {
            result.next = new ListNode(strSum.charAt(i));

            System.out.println(n.val);
        }
        return result;
    }

    public void insertAfter(ListNode prev_node, int new_data) {
        ListNode new_node = new ListNode(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
