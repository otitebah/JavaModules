package JavaModule01.ex00;

import java.util.UUID;

class Transaction{
    private UUID    identifier;
    private User    recipient;
    private User    sender;
    private String  transferCategory;
    private double     transferAmount;

    //constructor
    Transaction(User sender, User recipient, double amount){
        this.identifier = UUID.randomUUID();
        this.sender = sender;
        this.recipient = recipient;
        this.transferAmount = amount;
    }


    //getters
    public UUID getId(){
        return this.identifier;
    }
    public User getRecipient() {
        return this.recipient;
    }
    public User getSender(){
        return this.sender;
    }
    public String getTransferCategory(){
        return this.transferCategory;
    }
    public double getTransferAmount() {
        return this.transferAmount;
    }
}