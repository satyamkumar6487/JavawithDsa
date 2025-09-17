import java.util.Scanner;

public class ConditionalQuestions01 {

    public static void main (String [] args) {

        Scanner sc = new Scanner(System .in);
        System.out.println ("Enetr a marks ");
        int marks = sc.nextInt();






        if ( marks > 90  ){
            System.out.println(" excellent");
        } else if (marks > 80 && marks <= 90) {
            System.out.println("good");

        } else if (marks > 70 && marks <= 80 ){
            System.out.println ("fair ");
        } else if (marks > 60 && marks <= 70 ){
            System.out.println("Meets exception");
        } else {
            System.out.println (" Below par");

            }
        }

    }





