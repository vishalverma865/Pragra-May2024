package BasicJava.GetSetter;

public class ExcelSheet {

  private  String data = "hello";
//  public ExcelSheet(String data) {
//      this.data = data;
//  }
    public  ExcelSheet(String name){
        this.data = name;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
