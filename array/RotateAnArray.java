//https://leetcode.com/problems/rotate-array/
package array;

public class RotateAnArray {
    public static void rotateArray(int[] arr, int k) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < k; i++) {
            newArr[i] = arr[arr.length - k + i]; //  4, 5, 6
        }
        int j = 0;
        for (int i = k; i < arr.length; i++) {
            newArr[i] = arr[j]; //0,1,2,3, 4
            j++;
        }
        System.arraycopy(newArr, 0, arr, 0, arr.length);
    }

    public static void rotate(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateWithoutExtraSpace(int[] nums, int k) {
        if (nums == null || nums.length == 1) {
            return;
        }
        int n = nums.length;

        k = k % n;
        rotate(nums, 0, n - 1 - k);
        rotate(nums, n - k, n - 1);
        rotate(nums, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2};
        rotateWithoutExtraSpace(arr, 3);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
