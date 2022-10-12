public class MergeTwoSortedLists {
    public static void main(String[] args) {


    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode node = new ListNode(0);

        ListNode curr = node;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                l1 = swapNode(l1, curr);
            } else {
                l2 = swapNode(l2, curr);
            }
            curr = curr.next;
        }
        curr.next = l1 == null ? l2 : l1;
        return node.next;
    }

    private static ListNode swapNode(ListNode l, ListNode curr) {
        curr.next = l;
        l = l.next;
        return l;
    }


    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
