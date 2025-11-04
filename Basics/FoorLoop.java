import java.util.Arrays;

public class FoorLoop {

    public static void main (String [] args) {


//int num = 6;
//        for (int i = num; i <= 55; i++){
//            System.out.println(i);


        int[] arr = {1, 2, 1, 2, 3, 4, 5, 56};


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 3) {

                break;
               // continue;
            }
            System.out.println(arr[i]);
        }


    }}