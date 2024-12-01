package com.parkinglot.dtos;

import com.parkinglot.models.Ticket;
import lombok.Data;

@Data
public class IssueTicketResponseDto {
    private Ticket ticket;
    private ResponseStatus responseStatus;
}
