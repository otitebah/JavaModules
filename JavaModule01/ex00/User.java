
import java.util.UUID;
import java.util.List;
import java.util.ArrayList;
// import JavaModule01.ex00.Transaction;


public class User{
    private UUID    identifier;
    private String  name;
    private double  balance;
    public List<Transaction> transactions;

    //Constructor
    public User(String name, double balance){
        this.identifier = UUID.randomUUID();
        this.name = name;
        this.balance = balance; 
        this.transactions = new ArrayList<>();
    }

    //Getters
    public UUID getId(){
        return this.identifier;
    }
    public String getName(){
        return this.name;
    }
    public double getBalance(){
        return this.balance;
    }
    //Setters
    public void setName(String name){
        this.name = name;
    }
    public void setBalance(double balance){
        if (balance < 0)
            System.out.println("Error: balance cannot be negative");
        else
            this.balance = balance;
    }

    //Methods
    public void sendMoney(User recipient, double amount){
        if (amount <= 0){
            System.out.println("Error: Operation can't be Done!");
            return;
        }
        if (this.balance < amount) {
            System.out.println("Error: " + this.name + " does not have enough money!");
            return;
        }
        if (recipient.getName() == this.name){
            System.out.println("Error: You can't send money to yourself!!");
            return;
        }
        // Deduct money from sender, add to recipient
        double newBalence = this.getBalance() - amount;
        this.setBalance(newBalence);
        recipient.setBalance(recipient.getBalance() + amount);

        // Generate a single UUID for both transactions
        UUID transactionId = UUID.randomUUID();

        // Create transactions
        Transaction senderTransaction = new Transaction(transactionId, this, recipient, newBalence, "OUTCOME");
        Transaction recipientTransaction = new Transaction(transactionId, this, recipient, amount, "INCOME");

        this.transactions.add(senderTransaction);
        recipient.transactions.add(recipientTransaction);
        System.out.println(this.transactions);
        System.out.println(recipient.transactions);

        System.out.println("Transaction successful: " + this.name + " sent " + amount + " to " + recipient.name);
    }

}