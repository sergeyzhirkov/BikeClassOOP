package com.sergeyzhirkov.bikeclass.bikes;

import com.sergeyzhirkov.bikeclass.bikes.components.frame.Frame;
import com.sergeyzhirkov.bikeclass.bikes.components.handlebar.BaseHandlebar;
import com.sergeyzhirkov.bikeclass.bikes.components.handlebar.handlebartypes.CustomHandlebar;
import com.sergeyzhirkov.bikeclass.bikes.components.properties.TypeHandlebar;
import com.sergeyzhirkov.bikeclass.bikes.components.properties.TypeWheel;
import com.sergeyzhirkov.bikeclass.bikes.components.wheel.BaseWheel;
import com.sergeyzhirkov.bikeclass.bikes.components.wheel.wheeltypes.CustomWheel;

public class CustomBike extends BaseBike {
    public CustomBike(TypeHandlebar handlebarType, TypeWheel wheelType) {
        frame = new Frame();
        handlebar = new CustomHandlebar(handlebarType);
        frontWheel = new CustomWheel(wheelType);
        backWheel = new CustomWheel(wheelType);
    }
}
