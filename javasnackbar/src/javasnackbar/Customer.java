package javasnackbar;

public class Customer {
    private static int maxId = 0;

    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand){
        maxId++;
        this.id = maxId;

        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public double getCashOnHand(){
        return this.cashOnHand;
    }

    public void addCash(double amt){
        this.cashOnHand += amt;
    }

    public void buySnacks(double totalCost){
        this.cashOnHand -= totalCost;
    }
}
