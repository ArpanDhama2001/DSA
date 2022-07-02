// https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class MissMatch {
    public static void main(String[] args) {
        int[] nums = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != i+1) {
                ans[0] = nums[i];
                ans[1] = i+1;
            }
        }
        return ans;
    }

    static void sort(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
