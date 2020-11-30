package javasnackbar;

public class VendingMachine {
    public static int maxId = 0;

    public int id;
    public String name;

    public VendingMachine(String name){
        maxId++;
        id = maxId;

        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
}
