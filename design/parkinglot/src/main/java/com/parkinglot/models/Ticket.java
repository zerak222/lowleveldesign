package com.parkinglot.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
public class Ticket extends BaseModel{
    private String number;
    private ParkingSlot slot;
    private Gate gate;
    private Date entryTime;
    private Vehicle vehicle;
    private GateOperator operator;


}
