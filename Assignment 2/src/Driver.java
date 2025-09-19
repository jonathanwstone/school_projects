import java.util.*;
import java.util.ArrayList;
public class Driver {
    static Scanner input = new Scanner(System.in);
    static ArrayList<Building> buildings = new ArrayList<Building>();
    static int id = 0;

    public static void main(String[] args) {
        // The loop
        while (true){
            // Menu with choice tool
            System.out.println("1. Add building");
            System.out.println("2. Remove building");
            System.out.println("3. List all buildings");
            System.out.println("4. List all tenants");
            System.out.println("5. Add tenant");
            System.out.println("6. Remove tenant");
            System.out.println("7.  Update tenant");
            System.out.println("8. Charge rent");
            System.out.println("9. Pay for service");
            System.out.println("0. Quit ");
            System.out.print("Enter your choice: ");
            int userChoice = input.nextInt();

            //if elif to direct to option
            if (userChoice == 1){
                System.out.print("How many tenants can this building have? ");
                int size = input.nextInt();
                Building newUnit = new Building(size);

                System.out.println("Building " + newUnit.getID() + " created");

            }
            else if (userChoice == 2){
                System.out.print("Enter id of building to remove: ");
                int index = input.nextInt();
                if (index <= buildings.size() && buildings.get(index) != null){
                    buildings.remove(index);
                }
                else{
                    System.out.println("Building " + index + " does not exist");
                }

            }
            else if (userChoice == 3) {
                int index = 0;
                for (Building b : buildings) {
                    int size = b.countTenants();
                    System.out.println("Building " + buildings.get(index) + " " + size + " tenants");
                    index++;

                }
            }
            else if (userChoice == 4){
                System.out.println("Enter the building id: ");
                int buildingId = input.nextInt();
                if (buildingId<0 || buildingId>buildings.size()) {
                    System.out.println("Invalid building id");
                }
                else {
                    buildings.get(buildingId).listTenants();
                }
            }
            else if (userChoice == 5){
                System.out.println("Enter the building id: ");
                int bId = input.nextInt();
                if (bId<0 || bId>buildings.size()) {
                    System.out.println("Invalid building id");
                }
                else {
                    Building ourBuilding=buildings.get(bId);
                    ourBuilding.listTenants();
                    input.nextLine();
                    System.out.println("Enter the tenants name: ");
                    String name = input.nextLine();
                    System.out.println("Enter the tenants age: ");
                    int age = input.nextInt();
                    System.out.println("Enter the tenants rent: ");
                    int rent = input.nextInt();
                    Tenant newDude=new Tenant(name,age,rent);
                    System.out.println(" the apartment number for the new Tenant");
                    int aptNum=input.nextInt();
                    if(ourBuilding.addTenant(newDude,aptNum)){
                        System.out.println("Tenant added");
                    }
                    else {
                        System.out.println("Tenant not added");
                    }
                }

            }
            else if (userChoice == 6){
                System.out.println("Enter the building id: ");
                int buildId = input.nextInt();
                if (buildId<0 || buildId>buildings.size()) {
                    System.out.println("Invalid building id");
                }
                else {
                    buildings.get(buildId).listTenants();
                    System.out.println("Enter apartment number: ");
                    int aptNum = input.nextInt();
                    if (aptNum<0 || aptNum>buildings.get(buildId).apartments.length) {
                        System.out.println("Invalid apartment number");
                    }
                    else {
                        if (buildings.get(buildId).removeTenant(aptNum)){
                            System.out.println("Tenant removed");
                        }
                        else{
                            System.out.println("Tenant not removed");
                        }
                    }
                }


            }
            else if (userChoice == 7){
                System.out.println("Enter the building id: ");
                int num=input.nextInt();
                if (num<0 ||num>buildings.size()) {
                    System.out.println("Invalid building id");
                }
                else {
                    buildings.get(num).listTenants();
                    System.out.println("Enter apartment number: ");
                    int aptNum = input.nextInt();
                    if (buildings.get(num).getTenant(aptNum)==null){
                        System.out.println("Tenant not found");
                    }
                    else {
                        Tenant person=buildings.get(num).getTenant(aptNum);
                        System.out.println((person.toString()));
                        System.out.println("Enter Tenants name: ");
                        String name = input.nextLine();
                        System.out.println("Enter Tenants age: ");
                        int age = input.nextInt();
                        System.out.println("Enter Tenants rent: ");
                        int rent = input.nextInt();
                        person.name=name;
                        person.age=age;
                        Tenant.rent = (double) rent;
                        buildings.get(num).apartments[aptNum]=person;
                    }
                }

            }
            else if (userChoice == 8){
                System.out.println("Enter the building id: ");
                int num2 = input.nextInt();
                if (num2<0 || num2>buildings.size()) {
                    System.out.println("Invalid building id");
                }
                else {
                    buildings.get(num2).listTenants();

                    System.out.println("Enter apartment number: ");
                    int aptNum2 = input.nextInt();
                    if (buildings.get(num2).getTenant(aptNum2)==null){
                        System.out.println("Tenant not found");
                    }
                    else {
                        System.out.println(Tenant.toString());
                        Building.collectRent(buildings.get(num2).getTenant(aptNum2));
                    }
                }

            }
            else if (userChoice == 9){
                System.out.println("Current balance is $" + Building.getBalance());
                System.out.println("Enter the service amount: $");
                double service = input.nextInt();
                Building.payForService(service);
            }
            else if (userChoice == 0){
                System.out.println("Shutting off...");
                break;

            }

        }


    }
}