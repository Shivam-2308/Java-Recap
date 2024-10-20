package classAndObject;

//Create multiple objects of a class and modify a static variable through one object.
// Check if the change is reflected in all other objects.
class Counter{
    static int count=0;
    int instanceVar = 100;
    Counter(){
        count++;
    }
    static void display(){
        System.out.println("I am static method");
        System.out.println("I am static variable printing in static method: "+count);  //can acess static variable
        //System.out.println(instanceVar); //cannot access instance variable
    }
    public void show(){
        System.out.println("I am instance method");
        System.out.println("I am static variable printing in instance method: "+count);
        System.out.println("I am instance variable printing in instance method: "+instanceVar);
    }
}

public class StaticAndInstance {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        System.out.println(Counter.count);
        Counter c2 = new Counter();
        System.out.println(Counter.count);
        Counter c3 = new Counter();
        c3.count=100;
        System.out.println("count after changing by object: "+Counter.count);
        System.out.println(c2.count);

        //Calling static method (get called by both by object and Class name)
        c1.display();
        Counter.display();

        //Calling instance method
        c1.show();
        //Counter.show();  //error is->non-static method show() cannot be referenced from a static context
    }

}
