package com.parkinglot.models;

import com.parkinglot.models.enums.ParkingSlotStatus;
import com.parkinglot.models.enums.VehicleType;
import lombok.Data;

import java.util.List;

@Data
public class ParkingSlot extends BaseModel {
    private int number;
    private ParkingFloor floor;
    private ParkingSlotStatus status;
    private List<VehicleType> supportedVehicleTypes;
}
