import java.util.Scanner;

public class RangePrimeNumber {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println(" give number which you want to check");
        int low = sc.nextInt();
        int high = sc.nextInt();

        for (int n = low ; n <= high; n++){
        int count = 0;


        for (int div = 2 ; div * div <= n; div++){
            if(n % div == 0){

                count ++ ;
                break;
            }}

            if (count == 0 ){
                System.out.println(n);


        }
        }




    }

}
