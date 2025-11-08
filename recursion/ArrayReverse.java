public class ArrayReverse {

    public static void main(String[] args) {


        int arr[] = {10, 20, 30};
        int idx = 0;

        displayArray(arr, idx);


    }

    static void displayArray(int[] arr, int idx) {

        if (idx == arr.length) {
            return;

        }

     //   System.out.println(arr[idx]);
        displayArray(arr ,  idx+ 1);



        System.out.println(arr[idx]);

    }
}