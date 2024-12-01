package com.parkinglot.factories;

import com.parkinglot.models.enums.ParkingSlotStrategyType;
import com.parkinglot.strategy.NearestParkingSlotAssignmentStrategy;
import com.parkinglot.strategy.ParkingSlotAssignmentStrategy;

public class ParkingSlotAssignmentStrategyFactory {


    public static ParkingSlotAssignmentStrategy getParkingLotStrategy(ParkingSlotStrategyType aParkingSlotStrategyType) {
        if(ParkingSlotStrategyType.NEAREST.equals(aParkingSlotStrategyType)){
            return new NearestParkingSlotAssignmentStrategy();
        }
        return new NearestParkingSlotAssignmentStrategy();
    }
}
