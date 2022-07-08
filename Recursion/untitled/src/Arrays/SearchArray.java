package Arrays;

import java.util.ArrayList;

public class SearchArray {
    public static void main(String[] args) {
        int[] arr={3,2,1,18,1,9};
        int[] arr2 = {1,2,3,4,5,6};
//        System.out.println(linearSearch(arr,1, 0));
//        System.out.println(findAllIndex(arr,1,0));
        System.out.println(binarySrach(arr2, 14, 0, 5));
    }


    static boolean linearSearch(int[] arr,int target, int i) {
        if(i == arr.length) return false;
        if(arr[i] == target) return true;
        else return linearSearch(arr, target, i+1);
    }

    static int binarySrach(int[] arr, int target, int start, int end) {
        if(start > end) return -1;
        int mid = start + (end - start) / 2;
        if(arr[mid] == target) return mid;
        if(arr[mid] < target) return binarySrach(arr, target, mid+1, end);
        else return binarySrach(arr, target, start, mid-1);
    }

    static ArrayList findAllIndex(int[] arr, int target, int i) {
         ArrayList<Integer> list = new ArrayList<>();
        if(i == arr.length) return list;
        if(arr[i] == target) {
            list.add(i);
        }
        list.addAll(findAllIndex(arr,target, i+1));
        return list;
    }
}
