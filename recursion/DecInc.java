public class DecInc {

    public static void main (String [] args){

        pdi(4);



    }

    static void pdi(int n){
        if (n== 0){
            return;
        }



        System.out.println(n);
        pdi(n-1);
        System.out.println(n);






    }


}
