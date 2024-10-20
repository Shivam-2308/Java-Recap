package constructor;

class  Car{
    String name;
    int price;
    Car(String name,int price){
        this.name=name;
        this.price=price;
    }
    Car(Car c1){
        name=c1.name;
        price= c1.price;
    }
    void display(){
        System.out.println("Model of car is: "+name+" and Price is: "+price);
    }
}

public class CopyConstructor {
    public static void main(String[] args) {
        Car c1 = new Car("Audi",2);
        Car c2 = new Car(c1);
        c1.display();
        c2.display();
    }
}
