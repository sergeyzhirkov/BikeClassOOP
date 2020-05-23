package com.sergeyzhirkov.bikeclass.bikes;

import com.sergeyzhirkov.bikeclass.bikes.components.Frame;
import com.sergeyzhirkov.bikeclass.bikes.components.Handlebar;
import com.sergeyzhirkov.bikeclass.bikes.components.Wheel;

public abstract class Bike {
    Frame frame;
    Handlebar handlebar;
    Wheel frontWheel;
    Wheel backWheel;

    public void turnLeft(){
        handlebar.setPositionHandlebar(Handlebar.Position.LEFT);
    }

    public void turnRight(){
        handlebar.setPositionHandlebar(Handlebar.Position.RIGHT);
    }

    public void turnStraight(){
        handlebar.setPositionHandlebar(Handlebar.Position.STRAIGHT);
    }

    public void driveForward(){
        turnStraight();
        frontWheel.moveForward();
        backWheel.moveForward();
    }

    public void driveBack(){
        turnStraight();
        frontWheel.moveBack();
        backWheel.moveBack();
    }
    public void driveLeft(){
        turnLeft();
        frontWheel.moveForward();
        backWheel.moveForward();
    }
    public void driveRight(){
        turnRight();
        frontWheel.moveForward();
        backWheel.moveForward();
    }
    public void stopMotion(){
        frontWheel.stopMove();
        backWheel.stopMove();
    }

    public String getStatusBikeDriving(){
        if (backWheel.getStatusDrive() == Wheel.Drive.STOP) {
            return "Велосипед стоит на месте, руль в позиции " + handlebar.getPositionHandlebar().name();
        } else if (backWheel.getStatusDrive() == Wheel.Drive.BACK){
            return "Велосипед движется назад";
        } else {
            if (handlebar.getPositionHandlebar() == Handlebar.Position.LEFT) {
                return "Велосипед едет влево";
            } else if (handlebar.getPositionHandlebar() == Handlebar.Position.RIGHT){
                return "Велосипед едет вправо";
            } else {
                return "Велосипед едет прямо";
            }
        }
    }

    public String getInfoBike(){
        return "Велосипед типа " + this.getClass().getSimpleName();
    }
}
