
import java.util.UUID;
// import JavaModule01.ex00.User;

public class Transaction{
    private UUID    identifier;
    private User    recipient;
    private User    sender;
    private String  transferCategory;
    private double     transferAmount;

    //constructor
    Transaction(UUID    identifier, User sender, User recipient, double amount, String transferCategory){
        this.identifier = identifier;
        this.sender = sender;
        this.recipient = recipient;
        this.transferAmount = amount;
        this.transferCategory = transferCategory;
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


    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + identifier +
                ", sender=" + sender.getName() +
                ", recipient=" + recipient.getName() +
                ", category='" + this.getTransferCategory() + '\'' +
                '}';
    }
}