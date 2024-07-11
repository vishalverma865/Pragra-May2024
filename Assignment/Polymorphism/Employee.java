package Assignment.Polymorphism;

public class Employee {
    private int employeeID;
    private String name;
    private double salary;

    public Employee(int employeeID, String name, double salary) {
        this.employeeID = employeeID;
        this.name = name;
        this.salary = salary;

    }
    public Double calculatePay() {
        return this.salary;
    }

}
