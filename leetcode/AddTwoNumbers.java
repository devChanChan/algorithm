import java.math.BigInteger;

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
        n1.printAll();
        n2.printAll();
        
        ListNode result = addTwoNumbers(n1, n2);
        result.printAll();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String str1 = String.valueOf(l1.val);
        String str2 = String.valueOf(l2.val);
        
        while (l1.next != null) {
            str1 = String.valueOf(l1.next.val) + str1;
            l1 = l1.next;
        }
        
        while (l2.next != null) {
            str2 = String.valueOf(l2.next.val) + str2;
            l2 = l2.next;
        }

        BigInteger intResult = new BigInteger(str1).add(new BigInteger(str2));
        String strResult = new StringBuilder(String.valueOf(intResult)).reverse().toString();

        ListNode result = new ListNode(new BigInteger(String.valueOf(strResult.charAt(0))).intValue());
        for (int i = 1; i < strResult.length(); i++) {
            append(result, new BigInteger(String.valueOf(strResult.charAt(i))).intValue());
        }
        return result;
    }

    public static void append(ListNode head, int d) {
        ListNode end = new ListNode(d);
        while (head.next != null) {
            head = head.next;
        }
        head.next = end;
    }


    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { 
            this.val = val; 
        }
        ListNode(int val, ListNode next) { 
            this.val = val; this.next = next; 
        }
        public void printAll() {
            ListNode n = this;
            while (n.next != null) {
                System.out.print(n.val + " -> ");
                n = n.next;
            }
            System.out.println(n.val);
        }
    }
}
