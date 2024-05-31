package BasicJava;
import java.util.Scanner;

public class ScannerInput {


    public void getUserInfo() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your First Name:");
        String firstName = scanner.nextLine();
        System.out.println("Enter your Last Name:");
        String lastName = scanner.next();
        System.out.println("Enter your email:");
        String userEmail = scanner.next();
        System.out.println("Enter your Phone:");
        int userPhone = scanner.nextInt();
        System.out.println("Enter your Address:");
        String userAddress = scanner.next();
        System.out.println("Enter your Salary:");
        double userSalary = scanner.nextDouble();
        //Display user Details
        System.out.println("User Details:- ");
        System.out.println(" First Name:- " + firstName);
        System.out.println(" Last Name:- " + lastName);
        System.out.println(" Email:- " + userEmail);
        System.out.println(" Phone:- " + userPhone);
        System.out.println(" Address:- " + userAddress);
        System.out.println(" Salary:- " + userSalary);


    }
}
