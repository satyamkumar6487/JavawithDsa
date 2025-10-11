import java.util.Scanner;

public class DigitFind {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        Long n = sc .nextLong();
        int d = sc.nextInt();

        int result = getNumber( n ,  d);

            System.out.print(result);



    }


    static int getNumber(Long n , int d ){

        int count = 0;

        while (n > 0) {
            Long digit = n % 10;

            n = n / 10;
            if (digit == d){
                count++;
            }

        }

        return  count;
    }




}
