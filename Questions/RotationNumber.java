import java.util.Scanner;

public class RotationNumber {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int k = sc.nextInt();
        int temp = num;
        int node = 0;

        while (temp !=0) {

            temp = temp/10 ;
            node++;

        }


        k = k % node;
        if (k < 0) {

            temp = temp /10;
            node ++;
        }



        int div = 1 ;
        int mul = 1;

        for (int i = 1; i <= node; i ++){
            if (i <= k){
                div = div * 10;
            }else {

                mul = mul * 10;
            }}


            int r = num / div;
            int q = num % div;

            int rot = q * mul + r;

            System.out.println(rot);


        }






    }

