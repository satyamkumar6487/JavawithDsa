package encapsulation;

import java.awt.*;

class Human {

   private  int age  = 40 ;
   //private   String name = "satyam";
private String name;

public int  getage(){

    return age ;
}

public void setName(String n ){
name = n;


}
public String getName(){
    return name;
}


}




public class Encapsulations {

    public static void main (String [] args){

//

       Human h = new Human();
       int p = h.getage();
       System.out.print(p);

       h.setName("satyam");

String s = h.getName();
System.out.print(s);






   //  int result = h.age;
//     String ss = h.name;
//     System.out.print(result + " " + ss);


    }

}
