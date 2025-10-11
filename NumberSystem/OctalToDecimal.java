import java.util.Scanner;

public class OctalToDecimal {

    public static void main(String [] args ){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int b = sc.nextInt();

        int result = octaltodecimal(n , b);
        System.out.print(result);


    }

    public static int octaltodecimal(int n , int b){


        int rev = 0;
        int p = 1 ;

        while (n > 0){

            int digit = n % 10;

            n = n /10;

            rev = rev + digit* p;

            p = p*b;


        }
        return  rev;




    }


}
