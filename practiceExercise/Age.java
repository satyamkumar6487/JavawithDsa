import java.util.Scanner;

public class Age {

    public static  void main (String[] args) {
        Scanner  sc = new Scanner(System.in);
        
        System.out.print("enter you age");
        int age = sc.nextInt();
        
        if (age <=13 ){
            System.out.print("babu ho  tum");
        } else if ( 13 >=age   ||  19 <= age ) {
            
            System.out.print("Tum bada ho gaya hai ");
            
        } else if (age >= 60  ) {
            System.out.print("you are buddha ");
            
        }

    }


    }





