package com.xtenzq.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClimbingTheLeaderboard {

    public static List<Integer> solution(List<Integer> ranked, List<Integer> player) {
        ArrayList<Integer> result = new ArrayList<>();

        int previousElement = 0;
        int realRankedPointer = 0;
        int fictionalRankedPointer = 0;
        int pointerPlayer = player.size() - 1;
        Integer currentRanked = 0;

        while (pointerPlayer >= 0) {
            currentRanked = ranked.get(realRankedPointer);

            if (previousElement == currentRanked) {
                realRankedPointer++;
                continue;
            }

            if (player.get(pointerPlayer) >= ranked.get(realRankedPointer)) {
                result.add(fictionalRankedPointer + 1);
                pointerPlayer--;
            }
            else {
                if (realRankedPointer + 1 < ranked.size()) {
                    fictionalRankedPointer++;
                    realRankedPointer++;
                    previousElement = currentRanked;
                }
                else {
                    result.add(fictionalRankedPointer + 2);
                    pointerPlayer--;
                }
            }
        }

        Collections.reverse(result);

        return result;
    }

}
