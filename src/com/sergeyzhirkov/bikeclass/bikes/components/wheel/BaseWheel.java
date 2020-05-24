package com.sergeyzhirkov.bikeclass.bikes.components.wheel;

import com.sergeyzhirkov.bikeclass.bikes.components.properties.Drive;
import com.sergeyzhirkov.bikeclass.bikes.components.properties.TypeWheel;

public abstract class BaseWheel implements Wheel {

    private TypeWheel type;
    private Drive statusDrive = Drive.STOP;

    public BaseWheel(TypeWheel type) {
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
