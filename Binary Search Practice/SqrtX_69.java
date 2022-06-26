public class SqrtX_69 {
    public static void main(String[] args) {
        int x = 4;
        int sqrt = returnSqrt(x);
        System.out.println(sqrt);
    }

    /*
     * Algorithm: BINARY SEARCH
     * Time Complexity: O(log(N))
     * Space Complexity: O(1)
     * 
     * ans * ans <= x;
     * 
     */

    static int returnSqrt(int x) {
        int start = 1;
        int end = x / 2;
        if (x <= 2)
            return 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            long temp = (long) mid * (long) mid;
            if (temp <= x) {
                start = mid + 1;
            } else if (temp > x) {
                end = mid - 1;
            }
        }
        return end;
    }
}
