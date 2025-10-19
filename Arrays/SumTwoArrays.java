import java.util.Scanner;

public class SumTwoArrays {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int [] arr1 = new int[n1];
        for (int i = 0 ; i < n1; i++){
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int [] arr2 = new int[n2];
        for (int i = 0; i < n2; i++){
            arr2[i] = sc.nextInt();
        }

        int [] res = new int[Math.max(n1, n2) + 1];

        int i = n1 - 1;
        int j = n2 - 1;
        int k = res.length - 1;

        int carry = 0;

        while (k >= 0) {   // last digit bhi include
            int sum = carry;
            if (i >= 0) sum += arr1[i];
            if (j >= 0) sum += arr2[j];

            res[k] = sum % 10;
            carry = sum / 10;

            i--; j--; k--;
        }

        // Printing after loop
        if (res[0] == 0) {
            for (int m = 1; m < res.length; m++) {
                System.out.print(res[m] + " ");
            }
        } else {
            for (int m = 0; m < res.length; m++) {
                System.out.print(res[m] + " ");
            }
        }
    }
}

