import java.util.Scanner;

public class ReverseNumber {


    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println("Enter a number");


//        while(num > 0 ) {
//
//
//            int dig = num %10;
//            num = num / 10;
//            System.out.println(dig);



        int rev =0 ;
        while (num > 0) {

            int dig = num %10;
            rev = rev * 10 + dig;

            num = num /10 ;

        }
System.out.println(rev);
    }


}
