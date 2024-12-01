package com.parkinglot.models;

import com.parkinglot.models.enums.PaymentMode;
import com.parkinglot.models.enums.PaymentStatus;
import lombok.Data;

import java.util.Date;

@Data
public class Payment extends BaseModel{
    private PaymentMode mode;
    private PaymentStatus status;
    private int amount;
    private Date time;
    private String referenceNumber;
}
