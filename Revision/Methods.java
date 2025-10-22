

// accessmodifier   returntype  methodname(parameter) {
// Body
//}
// accessmodifier void methodname()
// body
 // no retturn type
 //

class Computer{

    public int add(int a , int b ) {

        int r1 = a + b;

        return r1;
    }

}





public class Methods {
    public static void main (String[] args){

        Computer computer = new Computer();
    int result =     computer.add(3,6);

        System.out.println(result);
    }





}
