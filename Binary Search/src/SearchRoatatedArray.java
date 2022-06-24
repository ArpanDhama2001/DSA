public class SearchRoatatedArray {
    public static void main(String[] args) {
        // arr is array of 2 sorted arrays - [3,4,5,6,7] and [0,1,2]. 7 is pivot that saperates both arrays.
        // First find pivot and then search in both arrays.
        int[] arr = {3, 4, 5, 6,7, 0, 1, 2};
        int[] arr2 = {3,5,1};
        int target = 3;
        System.out.println(search2(arr2, target));
    }

    // imporoved findPivot function
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            // case 1: if mid > mid + 1
            if((mid != arr.length - 1) && (arr[mid] > arr[mid+1])) {
                return mid;
            }

            // case 2: if mid < mid - 1; then mid - 1 is pivot
            if((mid != 0) && (arr[mid] < arr[mid-1])) {
                return mid - 1;
            }

            // case 3: mid < start; pivot lies before mid
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            }

            // case 4: mid >= start;
            else {
                start = mid + 1;
            }
        }
        return  -1;
    }

    static int findPivotInDuplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            // case 1: if mid > mid + 1
            if((mid != arr.length - 1) && (arr[mid] > arr[mid+1])) {
                return mid;
            }

            // case 2: if mid < mid - 1; then mid - 1 is pivot
            if((mid != 0) && (arr[mid] < arr[mid-1])) {
                return mid - 1;
            }

            // case 3: if mid, start and end all are equal

        }
        return  -1;
    }

    // improved search function
    static int search2(int[] arr, int target) {
        int pivot = findPivot(arr);
        // if pivot not found then array is a normal sorted array. Hence simple binary search can be done.
        if(pivot == -1) {
            return binarySearch(arr, target, 0, arr.length-1);
        }
        // if array is rotated, i.e, pivot is found, we need to search for target in both arrays.
        else {
            // if arr[pivot] == target, return pivot
            if (arr[pivot] == target) {
                return pivot;
            }
            // else if target > first element, that means target lies between start and pivot - 1. Because every element after pivot is less than start.
            else if(target >= arr[0]) {
                return binarySearch(arr, target, 0, pivot-1);
            }
            // else target lies between pivot+1 and last element
            else {
                return binarySearch(arr, target, pivot+1, arr.length - 1);
            }
        }
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) return mid;
            else if(arr[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
