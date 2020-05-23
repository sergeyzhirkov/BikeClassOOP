package com.sergeyzhirkov.bikeclass.bikes;

import com.sergeyzhirkov.bikeclass.bikes.components.Frame;
import com.sergeyzhirkov.bikeclass.bikes.components.Handlebar;
import com.sergeyzhirkov.bikeclass.bikes.components.Wheel;

public class CustomBike extends Bike{
    public CustomBike(Handlebar.Type handlebarType, Wheel.Type wheelType) {
        frame = new Frame();
        handlebar = new Handlebar(handlebarType);
        frontWheel = new Wheel(wheelType);
        backWheel = new Wheel(wheelType);
    }
}
