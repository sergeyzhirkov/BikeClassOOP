package com.sergeyzhirkov.bikeclass.bikes;

import com.sergeyzhirkov.bikeclass.bikes.components.frame.Frame;
import com.sergeyzhirkov.bikeclass.bikes.components.handlebar.BaseHandlebar;
import com.sergeyzhirkov.bikeclass.bikes.components.handlebar.Handlebar;
import com.sergeyzhirkov.bikeclass.bikes.components.properties.Drive;
import com.sergeyzhirkov.bikeclass.bikes.components.properties.Position;
import com.sergeyzhirkov.bikeclass.bikes.components.wheel.Wheel;

public abstract class BaseBike implements Bike{
    protected Frame frame;
    protected Handlebar handlebar;
    protected Wheel frontWheel;
    protected Wheel backWheel;

    public void turnLeft(){
        handlebar.setPositionHandlebar(Position.LEFT);
    }

    public void turnRight(){
        handlebar.setPositionHandlebar(Position.RIGHT);
    }

    public void turnStraight(){
        handlebar.setPositionHandlebar(Position.STRAIGHT);
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
        if (backWheel.getStatusDrive() == Drive.STOP) {
            return "Велосипед стоит на месте, руль в позиции " + handlebar.getPositionHandlebar().name();
        } else if (backWheel.getStatusDrive() == Drive.BACK){
            return "Велосипед движется назад";
        } else {
            if (handlebar.getPositionHandlebar() == Position.LEFT) {
                return "Велосипед едет влево";
            } else if (handlebar.getPositionHandlebar() == Position.RIGHT){
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
