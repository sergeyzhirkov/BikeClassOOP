package com.sergeyzhirkov.bikeclass.bikes;

import com.sergeyzhirkov.bikeclass.bikes.components.properties.TypeHandlebar;
import com.sergeyzhirkov.bikeclass.bikes.components.properties.TypeWheel;

public class RoadBike extends CustomBike {
    public RoadBike() {
        super(TypeHandlebar.ROAD_HANDLEBAR, TypeWheel.ROAD_WHEEL);
    }
}
