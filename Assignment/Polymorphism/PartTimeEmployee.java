package Assignment.Polymorphism;

public class PartTimeEmployee extends Employee{


    public PartTimeEmployee(int employeeID, String name, double salary) {
        super(employeeID, name, salary);

    }

    @Override
    public Double calculatePay() {
        System.out.println("PartTime Employee Salary: ");
        return super.calculatePay()*20;
    }
}
