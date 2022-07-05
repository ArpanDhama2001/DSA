public class EvenOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(5) == 1? true: false);
    }

    static int isOdd(int n) {
        return n & 1;
    }
}
