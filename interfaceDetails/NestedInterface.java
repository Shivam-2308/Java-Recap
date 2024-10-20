package interfaceDetails;

interface Animal{
    void eat();
    interface Behaviour{
        void run();
    }
}
class Dog implements Animal,Animal.Behaviour{
    @Override
    public void eat() {
        System.out.println("Dog is eating!!");
    }

    @Override
    public void run() {
        System.out.println("Dog is running!!");
    }
}
public class NestedInterface {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.run();
    }
}
