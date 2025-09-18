import java.util.Scanner;

public class DigitCount {

    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.println ("Enetr a number");

        int num = sc.nextInt();
        int digit = 0;
        while(num !=  0 ){

//            if (num == 0) {
//                System.out.println(" code is finished");
//                break;
//            }
         num = num /10 ;

         digit++;
        }
        System.out.println(digit);
    }
}
