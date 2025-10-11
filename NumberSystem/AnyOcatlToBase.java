import java.util.Scanner;

public class AnyOcatlToBase {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int b1= sc.nextInt();
        int b2 = sc.nextInt();


        int dec = getNumberToDec(n , b1);

        int result = getNumberToBase(dec, b2);

        System.out.print(result);

    }

    public static int getNumberToDec(int n , int b1){


        int rev = 0;
        int pow = 1 ;

        while (n > 0){
            int digit = n % 10;
            n = n /10;

            rev = rev+ digit* pow;

            pow = pow * b1;

        }
        return rev;


    }
    public static int getNumberToBase(int n , int b2){

        int rev = 0;
        int pow = 1;


        while (n > 0 ){

            int digit = n % b2;
            n = n / b2;
            rev = rev+ digit* pow;

            pow =pow* 10;


        }
        return rev;


    }


}
