package javasnackbar;

public class Main {
    public static void processData(){
        Customer c1 = new Customer("Jane", 45.25);
        Customer c2 = new Customer("Bob", 33.14);

        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Office");

        Snack s1 = new Snack("Chips", 36, 1.75, v1.getId());
        Snack s2 = new Snack("Chocolate Bar", 36, 1.00, v1.getId());
        Snack s3 = new Snack("Pretzel", 30, 2.00, v1.getId());

        Snack s4 = new Snack("Soda", 24, 2.50, v2.getId());
        Snack s5 = new Snack("Water", 20, 2.75, v2.getId());

        // Begin data processing
        c1.buySnacks(s4.getTotalCost(3));
        s4.buySnack(3);

        System.out.println("Jane cash on hand " + c1.getCashOnHand());
        System.out.println("Quantity of Soda is " + s4.getQuantity());
        System.out.println();

        c1.buySnacks(s3.getTotalCost(1));
        s3.buySnack(1);

        System.out.println("Jane cash on hand " + c1.getCashOnHand());
        System.out.println("Quantity of Pretzel is " + s3.getQuantity());
        System.out.println();

        c2.buySnacks(s4.getTotalCost(2));
        s4.buySnack(2);

        System.out.println("Bob cash on hand " + c1.getCashOnHand());
        System.out.println("Quantity of Soda is " + s4.getQuantity());
        System.out.println();

        c1.addCash(10.00);

        System.out.println("Jane cash on hand " + c1.getCashOnHand());
        System.out.println();

        c1.buySnacks(s2.getTotalCost(1));
        s2.buySnack(1);

        System.out.println("Jane cash on hand " + c1.getCashOnHand());
        System.out.println("Quantity of Chocolate Bar is " + s2.getQuantity());
        System.out.println();

        s3.addQuantity(12);

        System.out.println("Quantity of Pretzel is " + s3.getQuantity());
        System.out.println();

        c2.buySnacks(s3.getTotalCost(3));
        s3.buySnack(3);
        
        System.out.println("Bob cash on hand " + c2.getCashOnHand());
        System.out.println("Quantity of Pretzel is " + s3.getQuantity());
        System.out.println();
    }

    public static void main(String[] args){
        processData();
    }
}
