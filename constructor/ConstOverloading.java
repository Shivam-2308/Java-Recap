package constructor;

class Students{
    int age;
    String name;
//    static  int staticVar   (static variable can get initialised by constructor but
//    final static variable ko class loding ke time pr hi kuch value chaiye final krne ke liye
//    so to initialise this we use static block)
    static int count;
    final static int fVar;
    static {
        fVar =200;
    }
    Students(){
    }
    Students(int age,String name,int count){
        this.name=name;
        this.age=age;
        this.count=count;
    }
}
public class ConstOverloading {
    public static void main(String[] args) {
        Students st1 = new Students();
        System.out.println("Name is: "+st1.name+" Age is: "+st1.age);
        Students st2 = new Students(21,"Kumar",100);
        System.out.println("Name is: "+st2.name+" Age is: "+st2.age+" Static var: "+Students.count+" fVar: "+Students.fVar);
    }
}
