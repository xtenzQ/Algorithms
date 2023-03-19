package com.xtenzq.leetcode;

import java.util.*;

public class Subsets {

    public static List<List<Integer>> solution(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        find(result, nums, new ArrayList<>(), 0);
        return result;
    }

    private static void find(List<List<Integer>> set, int[] nums, List<Integer> temp, int index) {
        if (index == nums.length) {
            set.add(temp);
            return;
        }
        find(set, nums, new ArrayList<>(temp), index + 1);
        temp.add(nums[index]);
        find(set, nums,new ArrayList<>(temp), index + 1);
        temp.remove(temp.size() - 1);
    }
}
