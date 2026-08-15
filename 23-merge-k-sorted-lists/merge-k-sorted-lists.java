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
class Solution {
    class Pair {
        int val;
        ListNode node;

        Pair(int val, ListNode node) {
            this.val = val;
            this.node = node;
        }
    }
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Pair> pq =
                new PriorityQueue<>((a, b) -> a.val - b.val);

        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                pq.add(new Pair(lists[i].val, lists[i]));
            }
        }

        ListNode dummyNode = new ListNode(-1);
        ListNode temp = dummyNode;

        while (!pq.isEmpty()) {

            Pair p = pq.poll();

            temp.next = p.node;

            if (p.node.next != null) {
                pq.add(new Pair(
                    p.node.next.val,
                    p.node.next
                ));
            }
            temp = temp.next;
        }

        return dummyNode.next;
    }
    }
