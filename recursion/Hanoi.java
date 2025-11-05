
public class Hanoi {

    public static void main (String[] args){
tower(3, 1 , 2, 3);


    }

    public static void tower(int n, int t1id,  int t2id ,int t3id ){


        if (n== 0) {
            return;
        }
// n = 3 , t1 = 1 , t2 = 2  , t3 = 3
        tower(n-1, t1id , t3id, t2id);
        System.out.println(n + "{" + t1id + "->" + t2id + "}");


        tower(n - 1, t3id, t2id, t1id);
    }

}
