package com.parkinglot.dtos;

import lombok.Data;

@Data
public class IssueTicketRequestDto {
    private String vehicleNumber;
    private String ownerName;
    private Long gateId;
    private Long operatorId;
}
