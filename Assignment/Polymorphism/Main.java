package Assignment.Polymorphism;

public class Main {

    public static void main(String[] args){

        FullTimeEmployee user1 = new FullTimeEmployee(3224, "Vishal", 25);
        PartTimeEmployee user2 = new PartTimeEmployee(3224, "Ravi", 25);


       System.out.println( user1.calculatePay());
       System.out.println( user2.calculatePay());
    }
}
