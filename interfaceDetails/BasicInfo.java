package interfaceDetails;
interface Parent{
    //private method
    private void privateMethod(){
        System.out.println("I am private method in interface!!");
    }
    //Default method
    default void detail(){
        System.out.println("I am default method of interface!!");
        privateMethod();  //calling private method (we can call private method in static method also)
    }
    //Static method
    static void about(){
        System.out.println("I am static method in interface!!");
    }
    void show();

}
class Child implements Parent{
    public void show(){
        System.out.println("show method implementation by implemented class Child!!");
    }
}

public class BasicInfo {
    public static void main(String[] args) {
        Child ch1 = new Child();
        ch1.detail();  //calling default method of Parent(Interface)
        ch1.show(); //calling abstract method
        Parent.about();  //calling static method

        //Interface as reference type
        Parent ch2 = new Child();
        ch2.show();
        ch2.detail();
    }
}
