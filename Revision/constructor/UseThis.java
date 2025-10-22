package constructor;


class Human {

private int age ;
private String name ;

public void setAge(int age ){
    this. age = age ;
}
public int getAge(){
    return  age;
}

public  String setName (String n){

    name = n;
    return  name ;

}

public String getName(){
    return  name ;

}

}









public class UseThis {

    public static void main (String[] args){
Human h = new Human();
h.setAge(30);
        System.out.println("Age: " + h.getAge());


h.setName("satyam");

String names = h.getName();
System.out.println(names);


    }
}
