public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-12, -4,0,0, 0, 3, 6,23, 45,83};
        int target = 0;
        int loc = binarySearch(arr, target);
        System.out.println(loc);
    }

    static int binarySearch(int[] arr, int target) {
        if(arr.length == 0) {
            System.out.println("Array is empty!");
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) {
                start = mid + 1;
            }
            else if(target < arr[mid]) {
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }
}