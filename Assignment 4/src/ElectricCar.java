public class ElectricCar extends Car implements ElectricEngine{

    // Variables
    double maxBattery;
    double currentCharge;

    // Constructor
    public ElectricCar(double maxBattery, double currentCharge) {
        this.maxBattery = maxBattery;
        this.currentCharge = currentCharge;
    }

    @Override
    public double rechargeBattery(double usedkW) {
        if ((currentCharge+=usedkW) > maxBattery){
            currentCharge = maxBattery;
        }
        else{
            currentCharge += usedkW;
        }
        return currentCharge;
    }

    // Implements getMaxBatter
    @Override
    public double getMaxBattery() {
        return maxBattery;
    }

    // Implements getCurrentCharge
    @Override
    public double getCurrentCharge() {
        return currentCharge;
    }
}
