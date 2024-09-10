package com.vehicle.test;
import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {
    public static void main(String[]args){
        System.out.println("*******CAR*******");
    Car obj=new Car();
    obj.setSpeed(120);
    obj.setFuelLevel(50);
    obj.drive(45);

System.out.println(obj.getspeedMph());
System.out.println(obj.getDistanceinkm() + "" + "is distance in km");

System.out.println("****ElectricCar***");
ElectricCar R=new ElectricCar();
R.setBatteryLevel(83);
R.drive(23);

System.out.println(R.getBatteryLevel());
}

}
