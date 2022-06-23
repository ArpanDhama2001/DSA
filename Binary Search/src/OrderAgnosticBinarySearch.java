public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] arr2 = {6,5,4,3,2,1};
        int target = 4;
        System.out.println(orderAgnostic(arr2, target));
    }
    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAgnostic = arr[start] > arr[end];
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target == arr[mid]) {
                return mid;
            }
            if(!isAgnostic) {
              if(target > arr[mid]) {
                  start = mid + 1;
              } else {
                  end = mid - 1;
              }
            } else {
                if(target < arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
