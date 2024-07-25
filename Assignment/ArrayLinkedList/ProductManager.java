package Assignment.ArrayLinkedList;
import java.util.ArrayList;
import java.util.LinkedList;


public class ProductManager {
   //Define ArrayList of type Product
   private ArrayList<Product> arrList;
    private LinkedList<Product> recentlyViewedProducts;

    public ProductManager() {
        this.arrList =new ArrayList<>();
        this.recentlyViewedProducts = new LinkedList<>();

    }

    public void addItem(Product item) throws Exception{
        if(item.getPrice() < 0) {
            throw new Exception("Invalid Price");
        }
        else {
            this.arrList.add(item);
        }
    }

    public  void removeItem(Product item) throws ProductNotFoundException {

            if(!this.arrList.remove(item)){
                throw new ProductNotFoundException("Item Not found for Remove");
        }
    }


    public void updateItem(String id, int quantity) throws ProductNotFoundException {
        boolean itemFound = false;
        for(Product item: this.arrList) {

            if(item.getId().equals(id)) {

                itemFound = true;
                item.setQuantity(quantity);
                viewedItemToList(item);
                break;
            }
        }
        if(!itemFound){
            throw new ProductNotFoundException("Error while Update item");
        }
    }





    public void findProductById(String id) throws ProductNotFoundException {
        boolean itemFound = false;
        for(Product item: this.arrList) {

            if(item.getId().equals(id)) {

                itemFound = true;
                System.out.println(item);
                viewedItemToList(item);
                break;
            }
        }
        if(!itemFound){
            throw new ProductNotFoundException("Not Found By Id");
        }
    }

    public void displayListItem(){
        for (Product itemValue: arrList) {
            System.out.println(itemValue);
        }
    }



    public void viewedItemToList(Product item){
        if(recentlyViewedProducts.size() < 5) {
            recentlyViewedProducts.add(item);
        }
        else {
            recentlyViewedProducts.set(0,item);
        }

    }

    public void displayRecentItems(){
        for(Product items: recentlyViewedProducts ) {
            System.out.println(items);
        }
    }






}
