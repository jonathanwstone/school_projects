import java.util.*;


public class Building {
    public Tenant [] apartments;
    private static double balance;
    private static int nextID = 1;
    private int id;


    //Tool
    static Scanner input = new Scanner(System.in);

    // Constructor
    public Building(int size){
        apartments = new Tenant[size];
        this.id = nextID;
        nextID+=1;
    }

    //Getters
    public int getID(){
        return id;
    }
    public static double  getBalance(){
        return balance;
    }

    // Tenant counter
    public int countTenants(){
        int count = 0;
        int i = 0;

        while(i < apartments.length){
            if(apartments[i] != null){
                count+=1;
                i+=1;

            }
            if (apartments[i] == null){
                i+=1;
            }

        }
        return count;
    }

    // Add Tenant
    public boolean addTenant(Tenant tenant, int index){
        if (index >= 0 && index < apartments.length && apartments[index] == null){
            apartments[index] = tenant;
            return true;
        }
        return false;
    }

    // Remove tenant
    public boolean removeTenant(int index){
        if (index >= 0 && index < apartments.length && apartments[index] != null){
            apartments[index] = null;
            return true;
        }
        return false;
    }

    // List Tenant
    public String listTenants(){
        int i = 0;
        while (i < apartments.length){
            if (apartments[i] == null){
                System.out.println("Apartment " + i + ": Empty");
            }
            else if (apartments[i] != null){
                System.out.println(apartments[i].toString());
            }
            i+=1;
        }
        // How I got it to work
        return " ";
    }

    // getTenant function to pull the Tenant at a certain index
    public Tenant getTenant(int index){
        if (index >= 0 && index < apartments.length && apartments[index] != null){
            return apartments[index];
        }
        // Returns null if it doesnt match
        return null;
    }

    // Collect Rent
    public static void collectRent(Tenant tenant){
        balance+= Tenant.rent;
        System.out.println("Tenant charged. New balance is $" + balance);
    }

    // Pay for service
    static void payForService(double payment){
        balance -= payment;
        System.out.println("New balance is $" + balance);

    }





    public static void main(String[] args) {



    }
}