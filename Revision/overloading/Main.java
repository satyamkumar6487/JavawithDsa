package overloading;

class  A {

    public int add(int a , int b){

        int res = a + b ;
        return  res;


    }

    public int add (int a , int b , int c){

        int res = a +b +c;
        return  res;
    }

}



public class Main {

    public static void main (String [] args ){

        A a = new A();
        int result =  a.add(1,2,3);
        System.out.println(result);


    }
}
