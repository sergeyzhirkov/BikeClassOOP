package com.sergeyzhirkov.bikeclass.bikes;

public interface Bike {
    void turnLeft();
    void turnRight();
    void turnStraight();
    void driveForward();
    void driveBack();
    void driveLeft();
    void driveRight();
    void stopMotion();
    String getStatusBikeDriving();
    String getInfoBike();

}
