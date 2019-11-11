import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the climbingLeaderboard function below.
    // https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        // Declare a return variable
        int[] aliceRanks = new int[alice.length];

        // Remove duplicate elements in 'scores' array, using LinkedHashSet
        LinkedHashSet<Integer> scoresSet = new LinkedHashSet<Integer>();
        for (int score : scores) {
            scoresSet.add(score);
        }

        // Convert the LinkedHashSet to Array
        int[] scoresArray = new int[scoresSet.size()];
        int i = 0;
        for (Integer val : scoresSet) {
            scoresArray[i++] = val;
        }

        /* Find the rank of Alice's score */
        int aliceRank;
        // iterate through alice scores Array
        for (int j = 0; j < alice.length; j++) {
            // iterate through scoresArray(no duplicates)
            for (int k = 0; k < scoresArray.length; k++) {

                if (alice[j] >= scoresArray[k]) {
                    aliceRank = k + 1;
                    aliceRanks[j] = aliceRank;
                    break;
                }
            }
            if (aliceRanks[j] == 0) {
                aliceRanks[j] = scoresArray.length + 1;
            }
        }

        return aliceRanks;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}