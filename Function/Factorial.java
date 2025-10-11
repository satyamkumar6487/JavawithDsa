import java.util.Scanner;

public class Factorial {




    public static int fact(int x ){
        int rev = 1;
        for (int i = 1; i<=x; i++){
            rev = rev*i;
        }

        return  rev;
    }

    public static void main (String []args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int nfact = fact(n);
        int nfactr = fact(n-r);


        int result = nfact / nfactr;

        System.out.println(n + "P" + r + " = " + result);
    }


}
