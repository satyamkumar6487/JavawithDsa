import java.util.Scanner;

public class DecimalToOcatl {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        int n = sc . nextInt();
        int b = sc.nextInt();

        int result =  octalNumber(n , b);
        System . out .println(result);

    }
   public  static int octalNumber(int n , int b){

int rv = 0;

int p = 1;
while (n > 0){

    int dig = n %b;

    n = n/b;

    rv=  rv + dig * p;

    p = p * 10;

}
return  rv;


    }


}
