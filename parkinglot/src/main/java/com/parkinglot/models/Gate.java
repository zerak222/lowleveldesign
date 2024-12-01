package com.parkinglot.models;

import com.parkinglot.models.enums.GateStatus;
import com.parkinglot.models.enums.GateType;
import lombok.Data;

@Data
public class Gate extends  BaseModel{
    private int gateNumber;
    private GateType gateType;
    private GateOperator operator;
    private ParkingLot parkingLot;
    private GateStatus gateStatus;
}
