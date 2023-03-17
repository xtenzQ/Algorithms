import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'climbingLeaderboard' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY ranked
     *  2. INTEGER_ARRAY player
     */

    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) {
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

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int rankedCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> ranked = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int playerCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> player = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = Result.climbingLeaderboard(ranked, player);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
