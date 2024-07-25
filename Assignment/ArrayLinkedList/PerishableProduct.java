package Assignment.ArrayLinkedList;

public class PerishableProduct extends Product{
    private String expireDate;

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public PerishableProduct(String id, String name, double price, int quantity, String expireDate) {
        super(id, name, price, quantity);
        this.expireDate = expireDate;


    }
}
