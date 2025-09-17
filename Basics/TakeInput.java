import java.util.Scanner;

public class TakeInput {
    public static void main(String [] args ){

        Scanner sc = new Scanner (System.in);

//        System.out.println("enter you number");
//        int n = sc.nextInt();
//         for (int i = 0 ; i <=n; i ++){
//             System.out.println(i);
//
//
//        }


//        System.out.println("enter your name ");
//        String name = sc.nextLine();
//
//        System .out.println (name);




        ///  Now together

        int n = Integer.parseInt(sc.nextLine());

        String name  = sc.nextLine();


        System.out.println("Dear " + name +  "here is your counting");
        for (int i = 0 ; i <= n; i++) {
            System.out.println(i);
        }



    }



}
