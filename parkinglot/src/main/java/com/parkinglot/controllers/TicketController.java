package com.parkinglot.controllers;

import com.parkinglot.dtos.*;
import com.parkinglot.exceptions.GateNotFoundException;
import com.parkinglot.models.Ticket;
import com.parkinglot.services.TicketService;

public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService aTicketService){
        this.ticketService = aTicketService;
    }
    public IssueTicketResponseDto issueTicket(IssueTicketRequestDto aRequestDto){
            IssueTicketResponseDto responseDto = new IssueTicketResponseDto();

        try {
            Ticket ticket = ticketService.issueTicket(aRequestDto.getVehicleNumber(), aRequestDto.getOwnerName()
                    , aRequestDto.getGateId(), aRequestDto.getOperatorId());
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            responseDto.setTicket(ticket);
        } catch (GateNotFoundException e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
        }

        return responseDto;
    }

    public DeleteTicketResponseDto deleteTicket(DeleteTicketRequestDto aRequestDto){
        return null;
    }
}
