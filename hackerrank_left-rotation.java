import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    /*
    * Left Rotation - DS|HackerRank
    * https://www.hackerrank.com/challenges/array-left-rotation/problem
    * Author: SeungChan Kim
    */
    public static int[] leftRotation(int n, int d, int[] a) {
        int[] result = new int[n];

        for(int i = 0; i < n; i++) {
            result[i] = a[(i+d)%n];
        }

        return result;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        scanner.close();

        // Left Rotation - DS|HackerRank
        a = leftRotation(n, d, a);

        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}