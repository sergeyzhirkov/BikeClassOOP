package com.sergeyzhirkov.bikeclass.bikes;

import com.sergeyzhirkov.bikeclass.bikes.components.properties.TypeHandlebar;
import com.sergeyzhirkov.bikeclass.bikes.components.properties.TypeWheel;

public class SportBike extends CustomBike {
    public SportBike() {
        super(TypeHandlebar.SPORT_HANDLEBAR, TypeWheel.SPORT_WHEEL);
    }
}
