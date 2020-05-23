package com.sergeyzhirkov.bikeclass.bikes.components;

public class Handlebar {
    public enum Position{
        LEFT,
        RIGHT,
        STRAIGHT;
    }
    public enum Type{
        SPORT_HANDLEBAR,
        ROAD_HANDLEBAR;
    }

    private Position positionHandlebar = Position.STRAIGHT;
    private Type typeHandlebar;

    public Handlebar(Type typeHandlebar) {
        this.typeHandlebar = typeHandlebar;
    }

    public Position getPositionHandlebar() {
        return positionHandlebar;
    }

    public void setPositionHandlebar(Position positionHandlebar) {
        this.positionHandlebar = positionHandlebar;
    }
}
