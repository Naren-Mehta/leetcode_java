package array;

public class ReverseAnArray {
    public static void rotate(int[] arr, int i){
        int start =0;
        int end = arr.length-1;

        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr= new int[]{1,2,3,4,5,6,7};
        rotate(arr, 3);

        for(int i: arr){
            System.out.print(i+" ");
        }
    }

}
