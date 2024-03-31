package test;

public class Customer {
    long id;
    String name;

    CreditCard cc;

    public CreditCard getCc() {
        return cc;
    }

    public void setCc(CreditCard cc) {
        this.cc = cc;
    }

    public Customer(long id, String name){
        this.id = id;
        this.name = name;
    }
}
