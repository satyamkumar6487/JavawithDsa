package overiding;


class A {

    public void show(){

        System. out.println(" A is Showing");
    }

    public void config(){
        System.out.println("A is config");
    }


}


class B extends  A {


    public void show(){
        System.out.println("B is showing");
    }



}





public class Main {
    public static void main (String [] args){

         A a = new A();


      //  A a = new B(); // overriding
        a.show();
        a.config();



    }

}
