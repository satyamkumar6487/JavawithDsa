package abstraction;

abstract class Car {

    public abstract void drive();

    public abstract void fly();

    public void playmusic() {
        System.out.println("musics");

    }


}

class wag extends Car {

    public void drive(){

        System.out.println("driving");
    }

    public void fly(){
        System.out.print("flying");
    }
}









public class Abstraction {
    public static void main (String[] args){

        Car car = new wag();
        car.drive();
        car.fly();
        car.playmusic();



    }


}
