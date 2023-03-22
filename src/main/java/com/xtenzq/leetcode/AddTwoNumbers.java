package com.xtenzq.leetcode;

import com.xtenzq.leetcode.utils.ListNode;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int think = 0;
        ListNode resultNode;
        ListNode previousNode = null;
        ListNode headNode = null;
        while (l1 != null || l2 != null || think != 0) {
            int firstNodeValue = l1 == null ? 0 : l1.val;
            int secondNodeValue = l2 == null ? 0 : l2.val;
            resultNode = new ListNode((firstNodeValue + secondNodeValue + think) % 10);
            if (previousNode != null) {
                previousNode.next = resultNode;
            }
            else {
                headNode = resultNode;
            }
            think = ((firstNodeValue + secondNodeValue + think) >= 10) ? 1 : 0;
            previousNode = resultNode;
            if (l1 != null) l1 = next(l1);
            if (l2 != null) l2 = next(l2);
        }
        return headNode;
    }

    private static ListNode next(ListNode node) {
        return node.next;
    }
}

