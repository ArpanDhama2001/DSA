// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
// Asked in GOOGLE.

import java.util.*;

public class FindAllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(missingNumbers(arr));
    }

    static List<Integer> missingNumbers(int[] arr) {
        cyclicSort(arr);
        List<Integer> missingNumbersList = new ArrayList<>();
        for(int i=0; i< arr.length; i++) {
            if(arr[i] != i + 1) {
                missingNumbersList.add(i + 1);
            }
        }
        return missingNumbersList;
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i , correct);
            } else {
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
