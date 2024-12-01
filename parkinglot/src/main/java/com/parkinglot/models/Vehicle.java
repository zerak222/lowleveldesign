package com.parkinglot.models;

import com.parkinglot.models.enums.VehicleType;
import lombok.Data;

@Data
public class Vehicle extends  BaseModel {
    private String number;
    private VehicleType type;
    private String ownerName;
}
