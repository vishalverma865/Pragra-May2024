package Assignment.Inheritance;
// Encapsulation
public class Main {

    public static void main(String[] args){

    Car car = new Car("ford", "fusion", 2017, 4);
    MotorCycle  motorCycle = new MotorCycle("Bajaj", "Pulsar", 2024, 4);
//    System.out.println(car);
//    System.out.println(motorCycle);
    car.displayInfo();
    System.out.println("_________________");
    motorCycle.displayInfo();
    motorCycle.setMake("Hero");
        motorCycle.displayInfo();
    }
}
