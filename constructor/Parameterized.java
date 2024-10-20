package constructor;

class Student{
    int age;
    String name;
    //Parameterized constructor
    Student(int age,String name){
        this.age=age;
        this.name=name;
    }

}
public class Parameterized {
    public static void main(String[] args) {
         Student st = new Student(20,"Shivam");
         System.out.println("My name is: "+st.name+" and age is: "+ st.age);
    }
}
