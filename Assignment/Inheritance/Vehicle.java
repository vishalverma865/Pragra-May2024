package Assignment.Inheritance;

public class Vehicle {

    private String make;
    private String model;
    private int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake(){
    return make;
    }
    public String getModel(){
        return model;
    }

    public int getYear(){
        return year;
    }

    public void setMake(String make){
      this.make = make;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setYear(int year){
        this.year = year;
    }







    public void start() {

    }
    public void stop() {

    }



    public void displayInfo() {
    System.out.println("Make " + this.make);
        System.out.println("Model " + this.model);
        System.out.println("Year " + this.year);
    }

//    @Override
//    public String toString() {
//        return this.make + " " + this.year + " " + this.model;
//    }
}
