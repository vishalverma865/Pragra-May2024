package BasicJava.ErrorHandling;
import java.util.Scanner;
import java.sql.Array;

public class main {

    public static void main(String[] args) {
//        int[] arr = new int[2];
//        try {
//            arr = new int[]{2,3, 4,5,6,7,6};
//            for (int i = 0; i <= arr.length ; i++) {
//                System.out.println(" Value of " + i);
//                System.out.println(arr[i]);
//            }
//        }
//        catch (IndexOutOfBoundsException e) {
//            System.out.println( e.getMessage());
//
//        }
//        System.out.println("Clear Done");

//    String str = null;
//    try {
//        str.toLowerCase();
//        System.out.println(5/0);
//
//    } catch ( NullPointerException | ArithmeticException e) {
//        e.getMessage();
//        System.out.println( e.getMessage());
//
//    }


        Bank service = new Bank(5000);

        System.out.println("Current Balance is: " + service.getBalance());
        System.out.println("Your Current Balance After deposit is : " + service.deposit(3000));

        try {
           // System.out.println("Balance after withdrawal is :" + service.withdrawal(90000));
            System.out.println("Balance after withdrawal is :" + service.withdrawal(90000));
            System.out.println("Balance after withdrawal is :" + 5/0);
        } catch (RuntimeException | IndexOutOfRunException e) {
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("Program Complete");
        }



    }


    class A {
        void display() {
            System.out.println("A");
    }}
    class B extends A {
        void display() {
            System.out.println("B");
        }
    }









}
