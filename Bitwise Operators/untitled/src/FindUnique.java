public class FindUnique {
        public static void main(String[] args) {
            int[] arr = { 1, 2, 5, 3, 2, 1, 5 };
            System.out.println(ans(arr));
        }
/*
* NOTE: i) a^1 = !a;
*       ii) a^0 = a;
*       iii) a^a = 0;
*
* So according to 3rd rule every element that occure twice will give 0 on XOR and the only element remaining will be the unique element;
* E.g. :- 0^(1^2^5^3^2^1^5) = 1^2^5^3^2^1^5 = 0^0^0^3 = 3;
 */
        static int ans(int[] arr) {
            int unique = 0;
            for (int n : arr) {
                unique ^= n;
            }
            return unique;
        }

}