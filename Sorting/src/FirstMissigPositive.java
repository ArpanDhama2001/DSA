public class FirstMissigPositive {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(firstMissingPositive(arr));
    }

    static int firstMissingPositive(int[] arr) {
        sort(arr);
        int ans = arr.length + 1;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1) {
                ans = i+1;
                break;
            }
        }
        return ans;
    }

    static void sort(int[] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct = arr[i] - 1;
            if((arr[i] > 0) && (arr[i] <= arr.length) && (arr[i] != arr[correct])) {
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
