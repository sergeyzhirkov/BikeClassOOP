package com.sergeyzhirkov.bikeclass.bikes.components.handlebar;

import com.sergeyzhirkov.bikeclass.bikes.components.properties.Position;
import com.sergeyzhirkov.bikeclass.bikes.components.properties.TypeHandlebar;

public abstract class BaseHandlebar implements Handlebar{

    private Position positionHandlebar = Position.STRAIGHT;
    private TypeHandlebar typeHandlebar;

    public BaseHandlebar(TypeHandlebar typeHandlebar) {
        this.typeHandlebar = typeHandlebar;
    }

    public Position getPositionHandlebar() {
        return positionHandlebar;
    }

    public void setPositionHandlebar(Position positionHandlebar) {
        this.positionHandlebar = positionHandlebar;
    }
}
