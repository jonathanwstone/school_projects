public class GasCar extends Car implements GasEngine{

    // Variables
    static double tankCapacity;
    static double currentVolume;

    // Constructor
    public GasCar(double tankCapacity, double currentVolume){
        this.tankCapacity = this.tankCapacity;
        this.currentVolume = this.currentVolume;
    }

    // Override for toString()
    @Override
    public String toString(){

        return "Car" + id + " | " + "Current Fuel" + currentVolume + "/" + tankCapacity;
    }

    public double refuelTank(double gasFill) {
        if((tankCapacity+=gasFill) > tankCapacity){
            currentVolume = tankCapacity;
        }
        else{
            currentVolume += gasFill;
        }
        return currentVolume;
    }

    // Implements getTankCapacity
    @Override
    public double getTankCapacity() {
        return tankCapacity;
    }

    // Implements getCurrentVolume
    @Override
    public double getCurrentVolume() {
        return currentVolume;
    }
}


