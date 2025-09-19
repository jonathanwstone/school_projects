import java.util.*;
public class Driver {
    // New Variables
    static double fuel = 4.00;
    static double kW = 0.20;
    static ArrayList<Car> Cars = new ArrayList<>();
    static double balance = 0.00;


    public static void main(String[] args) {

        // Tool
        Scanner input = new Scanner(System.in);
        Random r = new Random();

        // While loop so menu doesn't stop till exit command inputted
        while (true) {

            // Menu
            System.out.println("1. Add gas car");
            System.out.println("2. Add electric car");
            System.out.println("3. Add hybrid car");
            System.out.println("4. Refuel all gas engines");
            System.out.println("5. Recharge all electric engines");
            System.out.println("6. Refuel and recharge all vehicles");
            System.out.println("7. Display all vehicles");
            System.out.println("8. Dispatch all vehicles");
            System.out.println("9. Quit");
            System.out.print("Gas: " + fuel + "/gal | Electricity: " + kW + "/kW");

            // Choice tool
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();

            // Choice handler
            if (choice == 1) {
                // Car Variables
                double tankCapacity = (r.nextDouble(15.0) + 15.0);
                double currentVolume = (r.nextDouble(12.0) + 2.0);

                // Car Creator
                GasCar newGasCar = new GasCar(tankCapacity, currentVolume);
                int id = newGasCar.getId();
                System.out.print("Vehicle " + id + " has parked at pump");
                Cars.add(newGasCar);
            } else if (choice == 2) {
                // Car Variables
                double maxBattery = (r.nextDouble(60.0) + 40.0);
                double currentCharge = (r.nextDouble(28.0) + 30.0);

                // Car Creator
                ElectricCar newElectricCar = new ElectricCar(maxBattery, currentCharge);
                int id = newElectricCar.getId();
                System.out.print("Vehicle " + id + " has parked at charger");
                Cars.add(newElectricCar);

            } else if (choice == 3) {
                // Car Variables
                double tankCapacity = (r.nextDouble(15.0) + 15.0);
                double currentVolume = (r.nextDouble(12.0) + 2.0);
                double maxBattery = (r.nextDouble(60.0) + 40.0);
                double currentCharge = (r.nextDouble(28.0) + 30.0);

                // Car Creator
                HybridCar newHybridCar = new HybridCar(currentCharge, maxBattery, tankCapacity, currentVolume);
                int id = newHybridCar.getId();
                System.out.print("Vehicle " + id + " has parked at pump-charger");
                Cars.add(newHybridCar);

            } else if (choice == 4) {

                // Refuel tool
                for (Car Car : Cars) {
                    if (Car instanceof GasCar) {

                        // Casts gas car so we can reference objects
                        GasCar gasCar = (GasCar) Car;
                        double gasFill = gasCar.getTankCapacity() - gasCar.getCurrentVolume();
                        balance += (gasFill * fuel);
                        gasCar.refuelTank(gasFill);
                    }

                }
                System.out.println("All gas vehicles refueled. Current balance is $" + balance);

            } else if (choice == 5) {

                // Recharge tool
                for (Car Car : Cars) {
                    if (Car instanceof ElectricCar) {

                        // Casts electric car so we can reference objects
                        ElectricCar electricCar = (ElectricCar) Car;
                        double usedKw = electricCar.getMaxBattery() - electricCar.getCurrentCharge();
                        balance += (usedKw * kW);
                        electricCar.rechargeBattery(usedKw);
                    } else if (choice == 6) {
                        for (Car Car1 : Cars) {
                            if (Car1 instanceof GasEngine) {

                                // Casts gas car so we can reference objects
                                GasCar gasCar = (GasCar) Car1;
                                double gasFill = gasCar.getTankCapacity() - gasCar.getCurrentVolume();
                                balance += (gasFill * fuel);
                                gasCar.refuelTank(gasFill);
                            }
                            if (Car1 instanceof ElectricEngine) {

                                // Casts electric car so we can reference objects
                                ElectricCar electricCar = (ElectricCar) Car1;
                                double usedKw = electricCar.getMaxBattery() - electricCar.getCurrentCharge();
                                balance += (usedKw * kW);
                                electricCar.rechargeBattery(usedKw);
                            }


                        }
                    } else if (choice == 7) {
                        for (Car Car2 : Cars) {
                            if (Car2 instanceof HybridCar) {
                                HybridCar hybridCar = (HybridCar) Car2;
                                System.out.println(hybridCar.toString());
                            }
                            if (Car2 instanceof ElectricCar) {
                                ElectricCar electricCar = (ElectricCar) Car2;
                                System.out.println(electricCar.toString());
                            }
                            if (Car2 instanceof GasCar) {
                                GasCar gasCar = (GasCar) Car2;
                                System.out.println(gasCar.toString());
                            }
                        }
                    } else if (choice == 8) {
                        Cars.clear();
                        System.out.println("All vehicles have left.");
                    } else if (choice == 9) {
                        System.out.println("Shutting off...");
                        break;

                    } else {
                        System.out.println("Invalid choice");

                    }

                }
            }
        }
    }
}
