package com.sergeyzhirkov.bikeclass.bikes;

import com.sergeyzhirkov.bikeclass.bikes.components.Handlebar;
import com.sergeyzhirkov.bikeclass.bikes.components.Wheel;

public class RoadBike extends CustomBike{
    public RoadBike() {
        super(Handlebar.Type.ROAD_HANDLEBAR, Wheel.Type.ROAD_WHEEL);
    }
}
