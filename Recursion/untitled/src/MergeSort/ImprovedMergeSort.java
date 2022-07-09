package MergeSort;

import java.util.Arrays;

public class ImprovedMergeSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,7,6,9,2,1,5};
        int [] ans = sort(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] sort(int[] arr) {
        if(arr.length == 1) return arr;
        int mid = arr.length / 2;
        int[] left = sort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = sort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    static int[] merge(int[] first, int[] second) {
        int firstIndex = 0, secondIndex = 0, mergeIndex = 0;
        int[] mergedArray = new int[first.length + second.length];
        while(firstIndex < first.length && secondIndex < second.length) {
            if(first[firstIndex] <= second[secondIndex]) {
                mergedArray[mergeIndex] = first[firstIndex];
                firstIndex++;
            } else {
                mergedArray[mergeIndex] = second[secondIndex];
                secondIndex++;
            }
            mergeIndex++;
        }
        while(firstIndex < first.length) {
            mergedArray[mergeIndex] = first[firstIndex];
            mergeIndex++;
            firstIndex++;
        }
        while(secondIndex < second.length) {
            mergedArray[mergeIndex] = second[secondIndex];
            mergeIndex++;
            secondIndex++;
        }
        return mergedArray;
    }
}
