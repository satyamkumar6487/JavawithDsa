public class SwapFirstLast {

    public static void swap(int []arr, int i , int j ){

        int temp  = arr[i];
        arr[i] = arr[j];
        arr[j]  = temp;


    }





    public static void main (String [] args){

        int [] arr = new int [5];


        arr [0] = 1 ;
        arr[1] = 2;

        arr[2] = 3;

        arr[3] = 33;

        arr[4] = 55;

        swap(arr, 0,4);


        for (int i = 0 ; i <arr.length; i++){
            System.out.print(arr[i] + "   ");
        }

    }



}
