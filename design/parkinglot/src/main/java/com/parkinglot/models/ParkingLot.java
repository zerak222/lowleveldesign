package com.parkinglot.models;

import com.parkinglot.models.enums.ParkingLotStatus;
import com.parkinglot.models.enums.VehicleType;
import lombok.Data;

import java.util.List;

@Data
public class ParkingLot extends BaseModel{
    private List<ParkingFloor> floors;
    private List<ParkingSlot> slots;
    private List<Gate> gates;
    private List<VehicleType> allowedVehicles;
    private ParkingLotStatus status;
}
