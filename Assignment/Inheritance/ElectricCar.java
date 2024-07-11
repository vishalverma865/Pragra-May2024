package Assignment.Inheritance;

public class ElectricCar extends Car{
    int batteryCapacity;


    public ElectricCar(String make, String model, int year, int numDoors, int batteryCapacity) {
        super(make, model, year, numDoors);
        this.batteryCapacity = batteryCapacity;
    }

    public void chargeBattery() {

    }
}
