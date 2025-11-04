public class Factorials {

    public static void main (String [] args){


int n = 5;

int ans   = calfact(n);
System.out.println(ans);


    }

   public static int calfact(int n){

     if (n== 1 || n == 0){
            return  1 ;
        }
        int fact_n = calfact(n-1);

        int factorial = n * fact_n;

        return  factorial;


   }
}
