package Assignment.Assignment2;
import java.util.ArrayList;
import java.util.Scanner;

/*
Problem 1:
Create a Java program for a simple online bookstore. Each book has a title, author,
 price, and quantity available in stock. Implement the following functionalities:
Create a Book class with instance variables for title, author, price, and quantity.
 Implement a constructor to initialize these instance variables. Implement a static
 method in the Book class to calculate the total price of a given quantity of books.
 Create multiple instances of the Book class and demonstrate the use of the constructor
 and static method. You can extend this problem by adding more functionalities like
 adding books to a shopping cart, updating stock quantities, etc.
 */
public class Book {
    String title;
    String author;
    double price;
    int quantity;
    private ArrayList<Book> cart;

    public Book(String tName,String authorName, double BookPrice, int BookQuantity) {
        title = tName;
        author = authorName;
        price = BookPrice;
        quantity = BookQuantity;
        cart = new ArrayList<>();
    }

//MARK: calculate the total price of a given quantity of books

    public static double totalPrice(Book book){
        return book.price * book.quantity;
    }

//MARK: Add To Cart Function
    public void addToCart(Book book){
        this.cart.add(book);
        System.out.println("Book is added to cart");
    }

    public void cartItems() {
        System.out.println("Cart:");
        for (Book book:cart) {
            System.out.println("Book title: " + book.title + " by " + book.author);

        }
    }


    //MARK: UpdateQuantity to add more books

    public static int updateQuantity(Book book, int quantity) {
        book.quantity = book.quantity + quantity;
        return book.quantity;
    }




    public static void main(String[] args) {
        Book book = new Book("RedBook", "John peter", 46.76, 12);
        Book book2 = new Book("Computer Science", "advert", 100, 4);
        Book book3 = new Book("Math", "R.D Sharma", 78, 2);
        Book book4 = new Book("Blink of eye", "kevin Kerry", 300, 1);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Price of book is: " + totalPrice(book));
        System.out.println("updated Quantity: " + updateQuantity(book, 12));

        book.addToCart(book);
        book.addToCart(book2);
        book.addToCart(book3);
        book.addToCart(book4);

        book.cartItems();



    }


}

