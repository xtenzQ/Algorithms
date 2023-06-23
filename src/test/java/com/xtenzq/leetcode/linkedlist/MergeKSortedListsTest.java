package com.xtenzq.leetcode.linkedlist;

import com.xtenzq.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static com.xtenzq.leetcode.linkedlist.merge_k_lists.MergeKSortedLists.mergeKLists;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeKSortedListsTest {

    /**
     * Input: lists = [[1,4,5],[1,3,4],[2,6]]
     * Output: [1,1,2,3,4,4,5,6]
     * Explanation: The linked-lists are:
     * [
     *   1->4->5,
     *   1->3->4,
     *   2->6
     * ]
     * merging them into one sorted list:
     * 1->1->2->3->4->4->5->6
     */
    @Test
    void testSetOne() {
        ListNode first = ListNode.build(new int[]{1, 4, 5});
        ListNode second = ListNode.build(new int[]{1, 3, 4});
        ListNode third = ListNode.build(new int[]{2, 6});
        List<ListNode> lists = new LinkedList<>();
        lists.add(first);
        lists.add(second);
        lists.add(third);
        ListNode result = mergeKLists(lists);
        ListNode expected = ListNode.build(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
        assertEquals(expected, result);
    }

}
