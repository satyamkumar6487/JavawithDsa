import java.util.Scanner;

public class Pattern10
{


    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();


        int val = 1;
        for(int i = 1; i <=n; i++){

            for(int j = 1; j<=i; j++){

                System.out.print(val + "\t");
                val++;
            }
            System.out.println();
        }




    }



}
