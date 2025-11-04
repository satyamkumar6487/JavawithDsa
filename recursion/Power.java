public class Power {

    public static void main (String []  args){
        int n = 5;
        int x = 3 ;

        int res= power( x , n );

        System.out.println(res);


    }

    static  int power(int x , int n){

        if (n== 0){
            return  1;
        }


        int xnm1 = power(x , n-1);
        int xn = x * xnm1;
        return xn;

    }

}
