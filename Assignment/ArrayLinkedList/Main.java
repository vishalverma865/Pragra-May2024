package Assignment.ArrayLinkedList;

public class Main {


    public static void main(String[] args) {

        Product item1 = new Product("M001", "Badminton", 80.99, 4);
        Product item2 = new Product("M002", "Football", 35.80, 2);
        Product item3 = new Product("M003", "Basket Ball", 46.23, 3);
        Product item4 = new Product("M004", "Stumps", 20.00, 3);
        Product item5 =  new Product("M005", "Nee Pads", 11.99, 2);

        ProductManager productToAdd = new ProductManager();

//Adding item to List
        try {
            productToAdd.addItem(item1);
            productToAdd.addItem(item2);
            productToAdd.addItem(item3);
            productToAdd.addItem(item4);
            productToAdd.addItem(item5);

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(  "****************** Items Added to List ******************");

       productToAdd.displayListItem();

        System.out.println(  "****************** Item Removed from List ******************");
        //Remove Item

            try {
                productToAdd.removeItem(item4);
            } catch (ProductNotFoundException e) {
                System.out.println(e.getMessage());
            }

        productToAdd.displayListItem();

        System.out.println(  "****************** Update Item Value in list ******************");

//Update the List
        try {
            productToAdd.updateItem("M001", 6);
        } catch (ProductNotFoundException e){
            System.out.println(e.getMessage());
        }
        productToAdd.displayListItem();

        System.out.println(  "****************** Get Item by ID ******************");
        // Find Item Details by ID
        try {
            productToAdd.findProductById("M005");

        }
        catch (ProductNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(  "****************** Recently Viewed Item ******************");
        productToAdd.displayRecentItems();
    }
}
