package BasicJava.ErrorHandling;

public class Bank {
    private double balance;

    public Bank(double balance) {
        this.balance = balance;
    }
    public double deposit(double balance) {
        this.balance = this.balance + balance;
        return this.balance;

    }

    public double withdrawal(double amount) throws IndexOutOfRunException {
        if (amount> this.balance) {
          //  throw new RuntimeException("Insufficient Balance");
            throw  new IndexOutOfRunException("Insufficient Balance");
        } else {
            return this.balance - amount;
        }
    }

    public double getBalance() {
        return balance;
    }




}


