package com.xtenzq.leetcode.linkedlist.merge_k_lists;

import com.xtenzq.leetcode.utils.ListNode;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLists {

    public static ListNode mergeKLists(List<ListNode> lists) {
        // Initialize an empty priority queue (minHeap)
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparingInt(n -> n.val));

        // Iterate over the input list of linked lists, and for each list
        for (ListNode node : lists) {
            // Check if the list is not null
            if (node != null) {
                // Insert its head node into the priority queue
                minHeap.offer(node);
            }
        }

        ListNode resultListHead = new ListNode(0);
        // Initialize a dummy node and a cur node to keep track of the current position in the merged list
        ListNode cur = resultListHead;
        // Enter a loop that continues until the priority queue becomes empty:
        while (!minHeap.isEmpty()) {
            // Poll the smallest node from the priority queue using the poll() operation
            ListNode smallest = minHeap.poll();
            // Check if the polled node has a non-null next pointer
            if (smallest.next != null) {
                // Insert the next node into the priority queue using the offer() operation
                minHeap.offer(smallest.next);
            }
            // Create a new node with the value of the polled node and append it to the merged list by setting it
            // as the next node of the cur node
            cur.next = new ListNode(smallest.val);
            // Move the cur node to the newly added node
            cur = cur.next;
        }
        return resultListHead.next;
    }
}
