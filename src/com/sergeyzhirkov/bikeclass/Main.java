package com.sergeyzhirkov.bikeclass;

import com.sergeyzhirkov.bikeclass.bikes.Bike;
import com.sergeyzhirkov.bikeclass.bikes.RoadBike;
import com.sergeyzhirkov.bikeclass.bikes.SportBike;

public class Main {
    public static void main(String[] args) {
        Bike firstBike = new SportBike();
        Bike secondBike = new RoadBike();

        System.out.println(firstBike.getInfoBike());

        firstBike.turnLeft();
        firstBike.driveForward();
        firstBike.driveRight();

        System.out.println(firstBike.getStatusBikeDriving());

        firstBike.stopMotion();

        System.out.println(firstBike.getStatusBikeDriving());

        System.out.println(secondBike.getInfoBike());

        secondBike.driveForward();

        System.out.println(secondBike.getStatusBikeDriving());
    }
}
