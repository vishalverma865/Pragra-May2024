package Assignment.Inheritance;

public class MotorCycle extends Vehicle{
    int numCylinders;

    public MotorCycle(String make, String model, int year, int numCylinders) {
        super(make, model, year);
        this.numCylinders = numCylinders;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("No of Cyc: " + numCylinders);

    }
}
