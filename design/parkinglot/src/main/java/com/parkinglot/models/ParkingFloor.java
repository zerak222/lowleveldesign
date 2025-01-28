package com.parkinglot.models;

import com.parkinglot.models.enums.ParkingFloorStatus;
import lombok.Data;

import java.util.List;

@Data
public class ParkingFloor extends BaseModel{
    private int number;
    private List<ParkingSlot> slots;
    private ParkingFloorStatus status;
}
