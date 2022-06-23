public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int[] arr2 = {1,5,2};
        int target = 2;
        System.out.println(searchMountian(arr2, target));
    }
    static int searchMountian(int[] arr, int target) {
        int peak = findPeakElement(arr);
        int ans = orderAgnostic(arr, target, 0, peak);
        if(ans != -1) {
            return ans;
        } else {
            ans = orderAgnostic(arr, target, peak, arr.length - 1);
            return ans;
        }
    }
    static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }

    static int orderAgnostic(int[] arr, int target, int start, int end) {
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
