package com.parkinglot;

import com.parkinglot.controllers.TicketController;
import com.parkinglot.dtos.IssueTicketRequestDto;
import com.parkinglot.dtos.IssueTicketResponseDto;
import com.parkinglot.factories.ParkingSlotAssignmentStrategyFactory;
import com.parkinglot.models.Ticket;
import com.parkinglot.models.enums.ParkingSlotStrategyType;
import com.parkinglot.repositories.GateRepository;
import com.parkinglot.repositories.VehicleRepository;
import com.parkinglot.services.TicketService;
import com.parkinglot.strategy.ParkingSlotAssignmentStrategy;

public class ParkingLotApplication {
    public static void main(String[] args) {
        GateRepository gateRepo = new GateRepository();
        VehicleRepository vehicleRepo = new VehicleRepository();

        ParkingSlotAssignmentStrategy parkingSlotAssignmentStrategy =
                ParkingSlotAssignmentStrategyFactory.getParkingLotStrategy(ParkingSlotStrategyType.NEAREST);

        TicketService ticketService = new TicketService(gateRepo,vehicleRepo,parkingSlotAssignmentStrategy);
        TicketController controller = new TicketController(ticketService);

        IssueTicketRequestDto requestDto = new IssueTicketRequestDto();
        requestDto.setGateId(123L);
        requestDto.setOperatorId(1234L);
        requestDto.setOwnerName("Rakesh");
        requestDto.setVehicleNumber("AP28BV7594");

        IssueTicketResponseDto responseDto = controller.issueTicket(requestDto);
        Ticket ticket = responseDto.getTicket();
        System.out.println("Result : "+responseDto.getResponseStatus().name());
        System.out.println(ticket);

    }
}
