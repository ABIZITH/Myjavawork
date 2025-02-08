package questions;

import java.util.Arrays;

public class runningsum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println("Output: " + Arrays.toString(running(nums)));
    }

    static int[] running(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}

