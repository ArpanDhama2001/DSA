// https://leetcode.com/problems/missing-number/
// asked in AMAZON.

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {3,0, 1};
        System.out.println(missingNumber(arr));
    }

    /*
    * Algorithm used: CYCLIC SORT
    * Algorithm:
    *
    * given: arr = [9,6,4,2,3,5,7,0,1]
    * sorted arr = [0,1,2,3,4,5,6,7,9]
    * missing no. = 8
    *
    * In the sorted array every element is at index == element, i.e, element 2 is present at index 2.
    * Here correct position of an element will be index==element.
    * In sorted array, only the largest element will be unsorted and the index of that element will be the ans.
    * If in sorted array all the numbers are at correct indices then missing number will definitely be 'n', i.e., largest number
     * */

    static int missingNumber(int[] arr) {
        cyclicSort(arr);
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == arr.length) return i;
        }
        return arr.length;
    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i];
            if(arr[i] < arr.length && arr[i] != i) {
                swap(arr, arr[i], arr[arr[i]]);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = first;
        arr[first] = arr[second];
        arr[second] = temp;
    }
}



