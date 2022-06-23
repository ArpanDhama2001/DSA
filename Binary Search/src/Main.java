import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n, target, ans;

        System.out.print("Enter the number of elements of array: ");
        n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.print("Enter the target: ");
        target = in.nextInt();
        ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    // Linear Search Function
    static int linearSearch(int[] arr, int target) {
        if(arr.length == 0) {
            System.out.println("Array is empty!");
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if(element == target) {
                return i;
            }
        }
        return -1;
    }
}