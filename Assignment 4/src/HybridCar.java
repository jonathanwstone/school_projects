public class HybridCar extends Car implements ElectricEngine, GasEngine{

    // Variables
    double currentCharge;
    double maxBattery;
    double tankCapacity;
    double currentVolume;

    public HybridCar(double currentCharge, double maxBattery, double tankCapactity, double currentVolume){
        this.currentCharge = currentCharge;
        this.maxBattery = maxBattery;
        this.tankCapacity = tankCapactity;
        this.currentVolume = currentVolume;

    }

    @Override
    public double rechargeBattery(double kW) {
        if ((currentCharge+=kW) > maxBattery){
            currentCharge = maxBattery;
        }
        else{
            currentCharge += kW;
        }
        return currentCharge;
    }

    @Override
    public double getMaxBattery() {
        return maxBattery;
    }

    @Override
    public double getCurrentCharge() {
        return currentCharge;
    }

    @Override
    public double refuelTank(double fuel) {
        if((tankCapacity+=fuel) > tankCapacity){
            currentVolume = tankCapacity;
        }
        else{
            currentVolume += fuel;
        }
        return currentVolume;
    }

    @Override
    public double getTankCapacity() {
        return tankCapacity;
    }

    @Override
    public double getCurrentVolume() {
        return currentVolume;
    }
}
