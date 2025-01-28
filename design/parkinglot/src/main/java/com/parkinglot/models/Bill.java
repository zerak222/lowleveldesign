package com.parkinglot.models;

import com.parkinglot.models.enums.BillStatus;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class Bill extends BaseModel{
    private BillStatus status;
    private Ticket ticket;
    private Gate exitGate;
    private Date exitTime;
    private int amount;
    private List<Payment> payments;
}
