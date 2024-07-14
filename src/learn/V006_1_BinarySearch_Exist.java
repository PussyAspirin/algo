package learn;

public class V006_1_BinarySearch_Exist {
    public static void main(String[] args) {

    }
    //1. 有序数组arr中target是否存在
    public static boolean exist(int[] arr, int target) {
        if (arr == null || arr.length == 0) {
            return false;
        }
        // int语句可以合并在一起
        int left = 0, right = arr.length - 1, mid = 0;
        // 保证区间内有数存在
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == target) {
                return true;
            }else if (arr[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return false;
    }

    //2. 有序数组arr中找 >= target的最小位置
    public static int findLeft(int[] arr, int target) {
        int left = 0, right = arr.length - 1, mid = 0, ans = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    //3. 有序数组arr中找 <= target的最大位置





}
