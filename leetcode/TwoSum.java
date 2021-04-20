package leetcode;

import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {
       testTwoSum(new int[] {2,7,11,15}, 9);
       testTwoSum(new int[] {3,2,4}, 6);
       testTwoSum(new int[] {3,3}, 6);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution");
    }

    public static void testTwoSum(int[] input, int target) {
        System.out.println("nums = " + Arrays.toString(input) + ", target = " + target);
        System.out.println("Output: " + Arrays.toString(twoSum(input, target)));
    }
}
