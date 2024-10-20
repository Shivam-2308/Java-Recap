package constructor;

//If we make a constructor private then the object of it's class cannot instantiate.
//So to make instance once, there we have singleton design pattern
class Singleton{
    private static Singleton instance;
    private Singleton(){
        System.out.println("Singleton instance created!!");
    }
    public static Singleton getInstance(){
        if(instance==null)
            instance=new Singleton();
        return instance;
    }
}
public class SingletonPattern {
    public static void main(String[] args) {
        Singleton obj1 =Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1==obj2);
        System.out.println("obj1"+" "+ obj1.toString());
        System.out.println("obj2"+" "+ obj2.toString());
    }
}
