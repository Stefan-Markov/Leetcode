public class RemoveLinkedListElements {
    public static void main(String[] args) {

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

    static class Solution {
        private ListNode h;
        private ListNode t;

        public void addToTail(int v) {
            if (h == null) h = t = new ListNode(v, null);
            else {
                t.next = new ListNode(v, null);
                t = t.next;
            }
        }

        public ListNode removeElements(ListNode head, int val) {
            for (; head != null; )
                if (head.val != val) {
                    addToTail(head.val);
                    ListNode p = head;
                    head = head.next;
                    p.next = null;
                    p = null;
                } else {
                    ListNode p = head;
                    head = head.next;
                    p.next = null;
                    p = null;
                    if (head == null) break;
                }
            return h;
        }
    }
}
