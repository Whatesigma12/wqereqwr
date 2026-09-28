package vehicles;

public class ElectricCar extends Car {

    private int batteryCapacity;
    
    public ElectricCar(){
        engineType = "Electric";
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity){
            this.batteryCapacity = batteryCapacity;
    }

    public String vehicleType(){
        return "Electric Car";
    }
@Override 
public String toString() {
    return "ElectricCar {" +
    "model:" + getModel() + ", " +
    "license:" + getLicense() + ", " +
    "color:" + getColor() + ", " +
    "year:" + getYear() + ", " +
    "ownerName:" + getOwnerName() + ", " +
    "insuranceNumber:" + getInsuranceNumber() + ", " +
    "engineType:" + getEngineType() + ", " +
    "vehicleType:" + vehicleType() + ", " + 
    "batteryCapacity:" + getBatteryCapacity() + "}";
}
}