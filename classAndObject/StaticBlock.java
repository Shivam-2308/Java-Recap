package classAndObject;

//static block is executed only once when the class is loaded, before any instance is created.
//class Test{
//    static int count =0;
//    static {
//        System.out.println("I am static block");
//        System.out.println(++count);
//    }
//    Test(){
//        System.out.println("I am constructor");
//    }
//}
//The static block in the parent class is executed when a subclass is loaded, even if no instance is created.
class Parent{
    static {
        System.out.println("static block in parent class");
    }
}
class Child extends Parent{
    static {
        System.out.println("static block in child class");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
//        Test t1 = new Test();
//        Test t2 = new Test();
//        Test t3 = new Test();

        Child ch = new Child();  //first parent static block and then child static block get print
//        Parent p =new Parent();  //only parent class static block get print
    }
}
