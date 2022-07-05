public class FindIthBit {
    public static void main(String[] args) {
        System.out.println(findBit(20, 3));
    }

    static int findBit(int n, int i) {
        return (1 << i-1);
    }
}
