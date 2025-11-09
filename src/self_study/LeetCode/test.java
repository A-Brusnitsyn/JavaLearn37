package self_study.LeetCode;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {

        int[] arr= new int []{4,5,7,5,4,8};
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                if (arr[i] != arr[i + 1]) {
                    sum += arr[i];
                }
            } else if (i == arr.length) {
                if (arr[i] != arr[i - 1]) {
                    sum += arr[i];
                }
            } else if (arr[i] != arr[i - 1]) {
                if (arr[i] != arr[i + 1]) {
                    sum += arr[i];
                }
            }
        }
        System.out.println(sum);


    }
}
