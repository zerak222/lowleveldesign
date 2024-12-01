package com.parkinglot.strategy;

import com.parkinglot.models.ParkingLot;
import com.parkinglot.models.ParkingSlot;
import com.parkinglot.models.Vehicle;

public class NearestParkingSlotAssignmentStrategy implements  ParkingSlotAssignmentStrategy{
    @Override
    public ParkingSlot assignParkingSlot(ParkingLot aParkingLot, Vehicle aVehicle) {
        return new ParkingSlot();
    }
}
