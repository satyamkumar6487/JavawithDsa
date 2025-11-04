public class ZIgZag {




    public static void main(String[] args){

        pzz(2);

    }

    static  void pzz(int n){

        if (n== 0){
            return;
        }

        System.out.println(n);
        pzz(n-1);

        System.out.println(n);
        pzz(n-1);

    }


}
