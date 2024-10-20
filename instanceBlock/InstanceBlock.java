package instanceBlock;

//1. Instance Block Initializing Instance Variables Before Constructor
class Person{
    private String name;
    private int age;
    // Instance block to initialize the age
    {
        System.out.println("I am first Instance block");
        age=20;
    }
    //Constructor to initilize the name
    Person(String name){
        this.name=name;
        System.out.println("Constructor initializing the name!!");
    }
    public void display(){
        System.out.println("Name is: "+name+" and age is: "+age);
    }
    {
        System.out.println("I am second Instance block");
    }
}

//2. Use of Instance Blocks in Inheritance
class Animal{
    private String type;
    {
        System.out.println("Instance block of parent");
        type = "mammal";
    }
    Animal(){
        System.out.println("Constructor of parent class");
    }
    public String getType(){
        return type;
    }
}
class Dog extends Animal{
    private String breed;
    {
        System.out.println("instance block of chid");
        breed = "German";
    }
    Dog(){
        System.out.println("constructor of child");
    }
    public void displayInfo(){
        System.out.println("Type is: "+getType()+" and breed is: "+breed);
    }
}

public class InstanceBlock {
    static {
        System.out.println("Block in main class");
    }
    public static void main(String[] args) {
        Person p = new Person("Shivam");
        p.display();
        {
            System.out.println("I am block in main method");  //Local block
        }
        System.out.println("------");
        //for 2nd secenrio
        Dog dog1 = new Dog();
//        Dog dog2 = new Dog();    //As many objects are created,each time the instance block execute
//        dog1.displayInfo();
    }
}
