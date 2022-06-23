public class CeilingNumber {
    public static void main(String[] args) {
        int[] nums = {2, 3, 5, 9, 14, 16, 18};
        int target = 10;
        int ceiling = ceiling(nums, target);
        int floor = floor(nums, target);
        System.out.println(ceiling + "\n" + floor);
    }
    static int ceiling(int[] nums, int target) {
        // If target is greater than every element of the array, then there is no possible ans.
        if(target > nums[nums.length - 1]) return -1;

        // if target is in array then simply find it and return it,
        // else return nums[start] after while loop violates

        int start, end, mid;
        start = 0;
        end = nums.length - 1;
        while(start <= end) {
            mid = start + (end-start)/2;
            if(target == nums[mid]) {
                return nums[mid];
            } else if(target > nums[mid]) {
                start = mid+1;
            } else {
                end = mid-1;
            }
        }
        return nums[start];
    }

    static int floor(int[] nums, int target) {
        if(target < nums[0]) return -1;

        int start, end, mid;
        start = 0;
        end = nums.length -1;
        while(start <= end) {
            mid = start + (end-start)/2;
            if(target == nums[mid]) {
                return nums[mid];
            } else if(target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return nums[end];
    }
}
