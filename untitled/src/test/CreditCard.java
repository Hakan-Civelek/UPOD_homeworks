package test;

public class CreditCard {
    String no;
    double balance;

    Customer owner;

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public CreditCard(String no, double balance, Customer owner){
        this.no = no;
        this.balance = balance;
        this.owner = owner;
        owner.setCc(this);
    }
}
