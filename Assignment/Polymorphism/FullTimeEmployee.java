package Assignment.Polymorphism;

public class FullTimeEmployee extends Employee{

    public FullTimeEmployee(int employeeID, String name, double salary) {
        super(employeeID, name, salary);
    }

    @Override
    public Double calculatePay() {
        System.out.println("FullTime Employee Salary: ");
        double salaryOf = super.calculatePay() * 40;
        return salaryOf;
    }
}
