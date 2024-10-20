package abstractClass;

abstract class Animal{
    //non abstract method
    void nonAbstractMethod(){
        System.out.println("I am non-Abstract method in abstract class!!");
    }
    //static method
    static void staticMethod(){
        System.out.println("I am static method in abstract class!!");
    }
    //Constructor
    Animal(){
        System.out.println("I am default constructor of abstract class!!");
    }
    //final method (An abstract class can have final method but it cannot be override by subclass)
    final void display(){
        System.out.println("I am final method in abstract class!!");
    }

    //Class 'Cat' must either be declared abstract or implement abstract method 'show()' in 'Anima
//    abstract void show();

}
class Cat extends Animal{

}
public class BasicInfo {
    public static void main(String[] args) {
        //'Animal' is abstract; cannot be instantiated
        //Animal a = new Animal() ;
        Cat ct  = new Cat();
        ct.nonAbstractMethod();  //calling non Abstract method of abstract class
        Animal.staticMethod();   //calling static method of abstract class
        ct.display();  //calling final method of abstract class
    }
}
