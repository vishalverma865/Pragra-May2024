package BasicJava.Inheritance;

public class TestClass {

   public static void main(String[] argv) {
       Employee employeeOne = new Employee("Vishal", 25, "Brampton");

       System.out.println(employeeOne.age);
       employeeOne.age = 45;
       System.out.println(employeeOne.age);

   }
}
