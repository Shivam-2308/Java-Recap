package interfaceDetails;

interface EmptyInterface{

}
class MyClass implements EmptyInterface{
    //No method to implement
}
public class NoMethodsInterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println("MyClass implements EmptyInterface successfully!!");
    }
}
