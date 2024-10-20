package constructor;

class A{
    A(){
        System.out.println("I am defalut const. of A");
    }
    A(int x, int y){
        System.out.println("I am parameterised const. of A: "+ (x-y));
    }
}
class B extends A{
    B(){
        this(3,2);
        System.out.println("I am default const. of B");
    }
    B(int x, int y){
//        super(3,2);
        System.out.println("Parametrised const. of B: "+(x+y));
    }
//    A(int x,int y){       //constructor do not inherit,nor override
//        System.out.println(x*y);
//    }

}
public class ConstChaining {
    public static void main(String[] args) {
//        B b1 = new B();
        B b2 = new B(4,5);
    }
}
