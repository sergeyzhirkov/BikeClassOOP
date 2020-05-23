package com.sergeyzhirkov.bikeclass.bikes.components;

public class Wheel {
    public enum Type{
        ROAD_WHEEL,
        SPORT_WHEEL;
    }

    public enum Drive{
        FORWARD,
        BACK,
        STOP;
    }

    private Type type;
    private Drive statusDrive = Drive.STOP;

    public Wheel(Type type) {
        this.type = type;
    }

    public void moveForward(){
        statusDrive = Drive.FORWARD;
    }

    public void moveBack(){
        statusDrive = Drive.BACK;
    }

    public void stopMove(){
        statusDrive = Drive.STOP;
    }

    public Drive getStatusDrive() {
        return statusDrive;
    }
}
