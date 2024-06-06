
/*  Write a program that takes a student's score as input and prints out their corresponding grade based on the following criteria:
 Grade Score A: 90-100 B: 80-89 C: 70-79 D: 60-69 F: Below 60
*/

package Assignment;
import java.util.Scanner;
public class Q1 {

     public static char Grade(int score) {
         if(score >= 90 && score <= 100) {
             return 'A';
         }
        else if(score >= 80 && score <= 89) {
             return 'B';
         }
        else if(score >= 70 && score <= 79) {
             return 'C';
         }
        else if(score >= 60 && score <= 69) {
             return 'D';
         }
        else {
            return 'F';
         }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        int studentNumber = scanner.nextInt();
        System.out.println("Student Grade: " + Grade(studentNumber));

    }

}
