public class Recursion {

    public static void main(String [] args){

        int res = factorial(5);
        System.out.print(res);

    }

    public static int factorial(int n){

        if (n ==1 ){
            return  1 ;

        }

        return  n *   factorial( n-1);
    }
}
