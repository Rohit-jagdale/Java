class ListNode {
    int val;
    ListNode next;

    // Constructor to initialize the node with a value
    ListNode(int x) {
        val = x;
    }
}

public class Solution {
    public static void main(String[] args) {

        ListNode head = new ListNode(4);
        head.next = new ListNode(3);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(8);

        // deleteNode(head.next.next);
        // head = removeNthNodeFromLast(head, 3);
        // head = reverseList(head);

        ListNode currNode = head;
        while (currNode != null) {
            System.out.print(currNode.val);
            if (currNode.next != null) {
                System.out.print(" -> ");
            }
            currNode = currNode.next;
        }
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static ListNode removeNthNodeFromLast(ListNode head, int n) {
        int length = 0;
        ListNode curr = head;

        while (curr != null) {
            length++;
            curr = curr.next;
        }
        if (n == length) {
            return head.next;
        }
        ListNode prev = head;
        for (int i = 0; i < length - n - 1; i++) {
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static ListNode mergeSortedLists() {
        ListNode list1 = new ListNode(2);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(6);
        list1.next.next.next = new ListNode(8);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(4);
        list2.next.next = new ListNode(7);

        ListNode head = new ListNode(0);
        ListNode curr = head;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                curr.next = list2;
                list2 = list2.next;
            } else {
                curr.next = list1;
                list1 = list1.next;
            }
            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list2;
        }
        if (list2 != null) {
            curr.next = list1;
        }

        return head.next;
    }

    public static boolean checkPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        while (slow != null) {
            ListNode next = slow.next;
            slow.next = prev;
            prev = slow;
            slow = next;
        }

        ListNode curr = head;
        while (prev != null && curr != null) {
            if (prev.val != curr.val) {
                return false;
            }
            prev = prev.next;
            curr = curr.next;
        }
        return true;
    }

    public static boolean checkCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
