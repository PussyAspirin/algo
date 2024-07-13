package learn;

import java.util.Arrays;

public class V004_SelectBubbleInsert {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 2, 5};
        selectionSort(array1);
        System.out.println(Arrays.toString(array1));
    }

    //1. 选择排序
    // fori, [i, n-1] 上找min，把 min 换给 arr[i]，
    public static void selectionSort(int[] arr) {
        for (int minIndex, i = 0; i < arr.length - 1; i++) {
            minIndex = i;
            // 找到最小的index
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            //最小值交换到i位置
            swap(arr, i, minIndex);
        }
    }
    //1.1 swap函数
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
