package ru.job4j.array;

public class RightShift {

    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }

    }

    private static void shift(int[] nums) {
        int len = nums.length - 1;
        int temp = nums[len];
        for (int i = 0; i < len; i++) {
            nums[len - i] = nums[len - 1 - i];
        }
        nums[0] = temp;
    }

}