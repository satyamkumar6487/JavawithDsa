import java.util.Scanner;

public class DifferenceOfTwoArray {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int [] arr1 = new int [n1];
        for (int i = 0 ; i < arr1.length; i++){
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int [] arr2 = new int [n2];
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = sc.nextInt();
        }

        int [] res = new int [Math.max(n1 , n2)];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = res.length - 1;
        int borrow = 0;

        while (k >= 0) {
            int diff = arr1[i] - borrow;

            if (j >= 0) {
                diff = diff - arr2[j];
            }

            if (diff < 0) {
                diff = diff + 10;
                borrow = 1;
            } else {
                borrow = 0;
            }

            res[k] = diff;

            i--;
            j--;
            k--;
        }

        // remove leading zeros
        int idx = 0;
        while (idx < res.length && res[idx] == 0) {
            idx++;
        }

        // print result
        for (; idx < res.length; idx++) {
            System.out.print(res[idx] + " ");
        }
    }
}
