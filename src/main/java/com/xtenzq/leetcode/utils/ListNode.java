package com.xtenzq.leetcode.utils;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {

    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode next() {
        return next;
    }

    @Override
    public String toString() {
        return val + " " + ((next != null) ? next.toString() : "");
    }

    @Override
    public boolean equals(Object obj) {
        return (val == ((ListNode)obj).val) &&
                (next == null || next.equals(((ListNode) obj).next));
    }

    public static ListNode build(int[] list) {
        ListNode previous = null;
        ListNode head = null;
        for (int i = list.length - 1; i >= 0; i--) {
            head = new ListNode(list[i], previous);
            previous = head;
        }
        return head;
    }
}
