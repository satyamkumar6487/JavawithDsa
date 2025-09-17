import java.util.Scanner;

public class WhileQuestion {
    public static void main (String [] args ){

        Scanner sc = new Scanner (System.in);



                int num;
        int sum = 0;
        System.out.println(" enter number");

        num = sc.nextInt();
        while (num != 0){
            sum += num;
            System.out.println("sum = " + sum);
            num = sc.nextInt();
        }




    }

}
