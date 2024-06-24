package BasicJava;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
public class Test {

    public static void main(String[] args) {

        ScannerInput getUserDetails = new ScannerInput();
      //  getUserDetails.getUserInfo();

        Recursion callRecursion = new Recursion();
        System.out.println(callRecursion.goToPrint(1));
        System.out.println("Done");

        //Get User Input
        String name = "Vishal";
        name = "Vermag";
        String name2 = "Vishal";

        String name3= "Vishal";
        int len = name.length()-1;
        String[] ROrder;
        int j = 0;
       // System.out.println(name.hashCode() + "" + name2.hashCode() + "" + name3.hashCode());
        for(int i = len; i >= 0 ; i--) {
            j += 1;
            System.out.println(name.charAt(i));
        }





    }

}


