package Recursion_Level_1_Questions;

public class ReverseTheNumber {
    public static void main(String[] args) {
//        reverseTheNumber1(5208);
        int ans = reverseTheNumber2(528);
        System.out.println(ans);
    }

    static void reverseTheNumber1(int n) {
        if(n % 10 == n) {
            System.out.print(n);
            return;
        }
        System.out.print(n % 10);
        reverseTheNumber1(n/10);
    }

    // Better way to reverse the number;
    static int reverseTheNumber2(int n) {
        int digits = (int)(Math.log10(n)) + 1;
        return rev(n, digits);
    }


    static int rev(int n, int digits) {
        if(n%10 == n) return n;
        int rem = n % 10;
        return rem * (int) (Math.pow(10, digits - 1)) + rev(n/10, digits - 1);
    }
}
