package encapsulation;

class Account{
    private double balance;
    private final String accountNumber;  //Read-only field
    Account(String accountNumber){
        System.out.println("In Account constructor");
        this.accountNumber=accountNumber;  //Setting value only object creation
    }

    public double getBalance() {
        return balance;
    }
    //Setter for balance with validation
    public void deposit(double amount){
        if(amount>0)
            balance+=amount;
        else
            System.out.println("Deposit amount must be positive!!");
    }
    public void withdraw(double amount){
        if(amount>0 && amount<=balance)
            balance-=amount;
        else
            System.out.println("Invalid withdrawl amount!!");
    }
}

//Encapsulation with Immutable Objects
final class Student{
    private final String name;
    private final int rollNo;
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public String getName(){
        return name;
    }
    public int getRollNo(){
        return rollNo;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account ac = new Account("2345654221");
        ac.deposit(5000);
        ac.withdraw(3000);
        System.out.println("Left balance: "+ac.getBalance());
        ac.deposit(-200);

        //Encapsulation with Immutable Objects
        Student st = new Student("Shivam",20);
        System.out.println("Name of student: "+st.getName());
        System.out.println("RollNo: "+st.getRollNo());
        // No setters, so values cannot be changed
    }
}
