public class Sum {
    public static void main (String [] args){
printsum(1 , 5 , 0 );
    }
    public static void printsum(int i , int num , int sum ){
        if (i == num){
            sum += i ;
            System.out.println(sum);
            return;
        }
        sum += i;
        printsum(i + 1 , num , sum );
    }

}
