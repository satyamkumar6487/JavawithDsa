import java.util.Scanner;

public class primeNumberFunction {

    public static boolean isPrime(int n){

        if (n <= 1 ){
            return false;
        }
        if(n%2 == 0){
            return false;

        }

        for(int i = 3 ; i * i <= n; i+= 2){

            if(n % i ==0)
                return false;
        }
        return true;


    }


    public static void main (String [] args ){
        Scanner sc = new Scanner(System.in);

        System.out.println("How many number do you want to check ");

        int totalnumber = sc.nextInt();

        for (int i = 1 ; i <= totalnumber; i ++){

            System.out.println("Enter a number");
       int number = sc.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number +  " is mot prime ");
        }



        }

    }



}
