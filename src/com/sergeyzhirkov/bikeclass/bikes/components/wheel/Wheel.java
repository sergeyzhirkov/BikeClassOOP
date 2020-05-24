package com.sergeyzhirkov.bikeclass.bikes.components.wheel;

import com.sergeyzhirkov.bikeclass.bikes.components.properties.Drive;

public interface Wheel {
    public void moveForward();
    public void moveBack();
    public void stopMove();
    public Drive getStatusDrive();
}
