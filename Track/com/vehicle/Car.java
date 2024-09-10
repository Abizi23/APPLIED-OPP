package com.vehicle;

public class Car {
    private double speedKph;
    private float fuelLevel;
    private int distanceTraveled;

    public void setSpeed(double speed){
        this.speedKph=speed;
    }
    public void setFuelLevel(float fuel){
        this.fuelLevel=fuel;
    }

    public void drive(int distance){
        this.distanceTraveled=distance;
    }
    
    public double getspeedMph(){
        double speedinMph=speedKph/1.60934;
        return speedinMph;
    }
    public int getDistanceinkm(){
        return distanceTraveled;
    }
    public int calculateRemainingFuel(double distance){
        double RemainingFuel=fuelLevel-(distance*(0.005*fuelLevel));
        int RemainingFuelInteger=(int)RemainingFuel;
        return RemainingFuelInteger;
        
    }

}

