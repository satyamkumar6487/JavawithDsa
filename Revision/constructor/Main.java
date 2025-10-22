package constructor;



class  A {

    public A(){
        System.out.println("A  is printing ");
    }

    public A(int A , int B){

        System.out.println(" value A is printing");

    }
}

class B extends  A {


    public B() {
        super();  // by default always present
        System.out.println("B is printing ");
    }

    public B(int A, int B) {
        super(3, 4 );

        System.out.println("values B is printing ");
    }

}
public class Main {
    public static void main (String [] args){


        B  b = new B();


    }}

