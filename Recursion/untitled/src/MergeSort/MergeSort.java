package MergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] a = {1,4,5};
        int[] b = {0,1};
        System.out.println(Arrays.toString(sort(b)));
    }

    static int[] sort(int[] arr) {
        // base condition
        if(arr.length == 1) return arr;

        // splitting array into two parts
        int start = 0, end = arr.length - 1, mid = end/2;
        int[] arr1 = new int[mid + 1];
        int[] arr2 = new int[end - mid];
        for (int i = 0; i <= mid; i++) {
            arr1[i] = arr[i];
        }
        for (int i = mid+1,j=0; i <= end; j++,i++) {
            arr2[j] = arr[i];
        }

        // merging the two sorted arrays returned from the recursive calls and the returning it to above function call
        return merge(sort(arr1), sort(arr2));
    }

    static int[] merge(int[] a, int[] b) {
        int mergedArraySize = a.length + b.length;
        int[] mergedArray = new int[mergedArraySize];
        int mergeIndex = 0;
        int aIndex = 0;
        int bIndex = 0;
        while(aIndex < a.length && bIndex < b.length) {
            if(a[aIndex] <= b[bIndex]) {
                mergedArray[mergeIndex] = a[aIndex];
                aIndex++;
            } else {
                mergedArray[mergeIndex] = b[bIndex];
                bIndex++;
            }
            mergeIndex++;
        }
        if(aIndex < a.length) {
            for(int i = aIndex; i<a.length; i++) {
                mergedArray[mergeIndex] = a[i];
                mergeIndex++;
            }
        }
        if(bIndex < b.length) {
            for(int i = bIndex; i<b.length; i++) {
                mergedArray[mergeIndex] = b[i];
                mergeIndex++;
            }
        }
        return mergedArray;
    }
}
