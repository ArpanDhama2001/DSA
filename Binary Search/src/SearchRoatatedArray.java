public class SearchRoatatedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 0, 1, 2};
        int target = 0;
//        System.out.println(search(arr, target));
    }

    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] < arr[mid + 1]) {
                end = mid;
            } else if()
        }
    }
}
