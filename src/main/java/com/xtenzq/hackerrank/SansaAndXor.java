package com.xtenzq.hackerrank;

import java.util.List;

class SansaAndXor {

    public static int solution(List<Integer> arr) {
        if (arr.size() % 2 == 0) {
            return 0;
        }
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (i % 2 == 0) {
                result ^= arr.get(i);
            }
        }
        return result;
    }
}
