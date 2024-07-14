package learn;

import java.util.Arrays;

public class V005_Validator {
    public static void main(String[] args) {
        //最大数组长度
        int length；

        int[] arr1 = randomArray(10, 100);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] randomArray(int length, int maxValue) {
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            // (1~maxValue)之间随机数
            arr[i] = (int) (Math.random() * maxValue) + 1;
        }
        return arr;
    }
}
