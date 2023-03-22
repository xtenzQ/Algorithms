package com.xtenzq.leetcode;

import com.xtenzq.leetcode.utils.ListNode;
import org.junit.jupiter.api.Test;

import static com.xtenzq.leetcode.AddTwoNumbers.addTwoNumbers;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoNumbersTest {

    @Test
    void testSetOne() {
        ListNode first = ListNode.build(new int[] { 2, 4, 3 });
        ListNode second = ListNode.build(new int[] { 5, 6, 4 });
        ListNode result = addTwoNumbers(first, second);
        ListNode expected = ListNode.build(new int[] { 7, 0, 8 });
        assertEquals(expected, result);
    }

    @Test
    void testSetTwo() {
        ListNode first = ListNode.build(new int[] { 0 });
        ListNode second = ListNode.build(new int[] { 0 });
        ListNode result = addTwoNumbers(first, second);
        ListNode expected = ListNode.build(new int[] { 0 });
        assertEquals(expected, result);
    }

    @Test
    void testSetThird() {
        ListNode first = ListNode.build(new int[] { 9,9,9,9,9,9,9 });
        ListNode second = ListNode.build(new int[] { 9,9,9,9 });
        ListNode result = addTwoNumbers(first, second);
        ListNode expected = ListNode.build(new int[] { 8,9,9,9,0,0,0,1 });
        System.out.println(result);
        assertEquals(expected, result);
    }
}
