package JavaModule01.ex00;

import java.util.UUID;

public class User{
    private UUID    identifier;
    private String  name;
    private double  balance;

    //Constructor
    public User(String name, double balance){
        this.identifier = UUID.randomUUID();
        this.name = name;
        this.balance = balance; 
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
        this.setBalance(this.getBalance() - amount);
        recipient.setBalance(recipient.getBalance() + amount);
        @SuppressWarnings("unused")
        Transaction transaction = new Transaction(this, recipient, amount);
        System.out.println("Transaction successful: " + this.name + " sent " + amount + " to " + recipient.name);
    }
}