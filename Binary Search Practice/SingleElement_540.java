public class SingleElement_540 {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(arr));
    }

    /*
     * Algorithm: BINARY SEARCH
     * Before target: we have first number of pair at the even index;
     * After target: we have first number of the pair at odd index;
     * E.g. =>
     * In above array,
     * target: 2
     * Before target: First "1" of the pair of "1s" is present on index 0.
     * After target: first "4" of the pair of "4s" is present on index 5.
     */

    static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length == 1)
            return nums[0];
        if (nums[start] != nums[start + 1])
            return nums[start];
        if (nums[end] != nums[end - 1])
            return nums[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1])
                return nums[mid];
            if (mid % 2 == 0) {

                if (nums[mid] == nums[mid + 1])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (nums[mid] == nums[mid - 1])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
