package com.xtenzq.hackerrank;

import java.util.List;

public class ThreeDSurfaceArea {

    public static int solution(List<List<Integer>> A) {
        int h = A.size();
        int w = A.get(0).size();
        int size = 0;
        int side = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                int diff_row = 0;
                int diff_col = 0;
                if (j != w - 1) diff_row = (Math.min(A.get(i).get(j), A.get(i).get(j + 1))) * 2;
                if (i != h - 1) diff_col = (Math.min(A.get(i).get(j), A.get(i + 1).get(j))) * 2;
                size += A.get(i).get(j) * 6 - (A.get(i).get(j) - 1) * 2;
                side += diff_row + diff_col;
            }
        }
        return size - side;
    }
}
