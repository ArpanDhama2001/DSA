package Recursion_Level_1_Questions;

public class SumDigits {
    public static void main(String[] args) {
        int ans = sumDigit(13429);
        System.out.println(ans);
    }

    static int sumDigit(int n) {
        if(n == 0) return 0;
        return n % 10 + sumDigit(n/10);
    }
}
