public class MountainPeak {
    public static void main(String[] args) {
        int[] nums = {3, 5, 3, 2, 0};
        int[] nums2 = {1, 2, 3, 4, 5, 6};
        System.out.println(ans(nums));
    }

    static int ans(int[] nums) {
        if (nums.length == 1) {
            return 0;
        } else {
            int start = 0;
            int end = nums.length - 1;
            int ans = 0;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] > nums[mid + 1]) {
                    end = mid;
                } else if (nums[mid] > nums[mid - 1]) {
                    start = mid + 1;
                }
            }
            return end;
        }
    }
}
