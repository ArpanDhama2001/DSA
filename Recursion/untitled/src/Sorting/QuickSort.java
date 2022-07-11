package Sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5,3,4,23,1};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {
        if(low > high) return;
            int s = low, e = high;
            int mid = s + (e - s) / 2;
            int pivot = arr[mid];
            while(s <= e) {
                while(arr[s] < pivot) s++;
                while(arr[e] > pivot) e--;
                if(s<=e) {
                    swap(arr, s, e);
                    s++;
                    e--;
                }
            }

            sort(arr, low, e);
            sort(arr, s, high);
        }

    static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
}
