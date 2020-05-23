package com.sergeyzhirkov.bikeclass.bikes;

import com.sergeyzhirkov.bikeclass.bikes.components.Handlebar;
import com.sergeyzhirkov.bikeclass.bikes.components.Wheel;

public class SportBike extends CustomBike{
    public SportBike() {
        super(Handlebar.Type.SPORT_HANDLEBAR, Wheel.Type.SPORT_WHEEL);
    }
}
