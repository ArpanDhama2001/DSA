package Recursion_Level_1_Questions;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(111111));
    }

    static boolean isPalindrome(int n) {
        return (n == rev(n));
    }

    static int rev(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n, digits);
    }

    // returns the reverse of the number
    static int helper(int n, int digits) {
        if(n%10 == n) return n;
        int rem = n % 10;
        return (rem * (int)(Math.pow(10, digits -1 )) + helper(n/10, digits - 1));
    }
}
