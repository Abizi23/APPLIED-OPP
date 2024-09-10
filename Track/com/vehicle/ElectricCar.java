package com.vehicle;

public class ElectricCar {
    private double batteryLevel;

    public void setBatteryLevel(double battery){
        this.batteryLevel=battery;
    }

    public double getBatteryLevel(){
        return batteryLevel;
    }

    public void drive(int distance){

        super.drive(distance);

        this.batteryLevel-=(distance*0.01);
    }

}
