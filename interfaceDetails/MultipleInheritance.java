package interfaceDetails;

interface CarA{
    default void sound(){
        System.out.println("CarA Sound method!!");
    }
}
interface  CarB{
    default void sound(){
        System.out.println("CarB Sound method!!");
    }
}
class Ring implements CarA,CarB{
    @Override
    public void sound() {
        System.out.println("I am sound in Ring class!!");
        CarA.super.sound(); //calling CarA interface method
        CarB.super.sound(); //calling CarB interface method
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Ring rn = new Ring();
        rn.sound();  //this call the implemented class method

    }
}
