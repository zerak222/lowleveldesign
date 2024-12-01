package com.parkinglot.strategy;

import com.parkinglot.models.ParkingLot;
import com.parkinglot.models.ParkingSlot;
import com.parkinglot.models.Vehicle;

public interface ParkingSlotAssignmentStrategy {
    ParkingSlot assignParkingSlot(ParkingLot aParkingLot, Vehicle aVehicle);
}
