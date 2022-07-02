// https://leetcode.com/problems/assign-cookies/

import java.util.Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g = {10,9,8,7};
        int[] s = {5,6,7,8};
        System.out.println(findContentChildren(g,s));
    }

    static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0;
        int j = 0;
        int count = 0;
        while (j < s.length && i < g.length) {
            if(s[j] >= g[i]) {
                count++;
                j++;
                i++;
            } else {
                j++;
            }
        }
        return count;
    }

//    static void sort(int[] arr) {
//        int i=0;
//        while(i < arr.length) {
//            int correct = arr[i] - 1;
//            if(arr[i] != arr[correct]) swap(arr, i, correct);
//            else i++;
//        }
//    }
//
//    static void swap(int[] arr, int first, int second) {
//        int temp = arr[first];
//        arr[first] = arr[second];
//        arr[second] = temp;
//    }
}


