package app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class TestCar {

    public static void main(String[] args) {

        Vehicle car = new Car();
        car.setOwnerName("Alex");
        car.setInsuranceNumber("123456789");
        car.setEngineType("Gasoline");
        car.vehicleType();
        car.setModel("Toyota");
        car.setLicense("ABCD");
        car.setColor("Red");
        car.setYear(1993);


        System.out.println(car.toString());

        Vehicle electricCar = new ElectricCar();
        electricCar.setOwnerName("Michelle");
        electricCar.setInsuranceNumber("987654321");
        electricCar.vehicleType();
        electricCar.setModel("Tesla");
        electricCar.setLicense("EFGH");
        electricCar.setColor("Black");
        electricCar.setYear(2020);
        ((ElectricCar) electricCar).setBatteryCapacity(85);

        System.out.println(electricCar.toString());

    }
}
