package BasicJava;

public class Recursion {

    static int goToPrint(int num) {

        if (num <= 10) {
          return num + goToPrint(num+1);
        }
        return 0;



    }

}
