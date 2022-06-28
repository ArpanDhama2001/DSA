import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int t;
        t = sc.nextInt();
        while(t>0) {
            t--;
            int n;
            boolean end=false;
            n= sc.nextInt();
            int[] arr = new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i]=sc.nextInt();
            }
            for(int i=0; i<n-2; i++)
            {
                long target = arr[i] + arr[i+1] + arr[i+2];
                long found = binarySearch(arr, target);
                if(found == -1) {
                    System.out.println("NO");
                    end = true;
                    break;
                }
            }
            if(!end) {
                System.out.println("YES");
            }

        }
    }

    static int binarySearch(int[] arr, long target) {
        int start = 0;
        int end = arr.length;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}