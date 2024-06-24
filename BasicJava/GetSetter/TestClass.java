package BasicJava.GetSetter;

public class TestClass {

   public static void main(String[] argv) {
      ExcelSheet obj = new ExcelSheet("Hello");

       System.out.println(obj.getData());
       obj.setData("World");
       System.out.println(obj.getData());

   }
}
