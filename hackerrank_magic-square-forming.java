import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        int[][] ms1 = {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}};
        int[][] ms2 = {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}};
        int[][] ms3 = {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}};
        int[][] ms4 = {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}}; 
        int[][] ms5 = {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}};
        int[][] ms6 = {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}}; 
        int[][] ms7 = {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}}; 
        int[][] ms8 = {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}};

        int[] dif = new int[8];
        int minDif = 1000;

        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                dif[0] += Math.abs(s[i][j] - ms1[i][j]);
                dif[1] += Math.abs(s[i][j] - ms2[i][j]);
                dif[2] += Math.abs(s[i][j] - ms3[i][j]);
                dif[3] += Math.abs(s[i][j] - ms4[i][j]);
                dif[4] += Math.abs(s[i][j] - ms5[i][j]);
                dif[5] += Math.abs(s[i][j] - ms6[i][j]);
                dif[6] += Math.abs(s[i][j] - ms7[i][j]);
                dif[7] += Math.abs(s[i][j] - ms8[i][j]);
            }
        }

        for(int i=0; i<dif.length; i++) {
            if(dif[i] < minDif) {
                minDif = dif[i];        
            }
        }

        return minDif;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
