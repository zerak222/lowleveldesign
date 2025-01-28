package com.parkinglot.services;

import com.parkinglot.exceptions.GateNotFoundException;
import com.parkinglot.models.*;
import com.parkinglot.repositories.GateRepository;
import com.parkinglot.repositories.VehicleRepository;
import com.parkinglot.strategy.ParkingSlotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketService {

    private GateRepository gateRepo;
    private VehicleRepository vehicleRepo;
    private ParkingSlotAssignmentStrategy parkingSlotAssignmentStrategy;
    public TicketService(GateRepository aGateRepo,VehicleRepository aVehicleRepo
            ,ParkingSlotAssignmentStrategy aParkingSlotAssignmentStrategy){
        this.gateRepo = aGateRepo;
        this.vehicleRepo = aVehicleRepo;
        this.parkingSlotAssignmentStrategy = aParkingSlotAssignmentStrategy;

    }
    public Ticket issueTicket(String aVehicleNumber,String aOwnerName,Long aGateId,Long aOperatorId) throws GateNotFoundException {
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Optional<Gate> optionalGate = gateRepo.findByGateId(aGateId);
        if(optionalGate.isEmpty()){
            throw new GateNotFoundException("Invalid gate id:"+aGateId);
        }
        Gate gate = optionalGate.get();
        ticket.setGate(gate);
        ticket.setOperator(gate.getOperator());

        Optional<Vehicle> optionalVehicle = vehicleRepo.findByVehicleNumber(aVehicleNumber);
        Vehicle vehicle = null;
        if(optionalVehicle.isEmpty()){
            vehicle = new Vehicle();
            vehicle.setNumber(aVehicleNumber);
            vehicle.setOwnerName(aOwnerName);
            vehicle = vehicleRepo.save(vehicle);
        }else{
            vehicle = optionalVehicle.get();
        }
        ticket.setVehicle(vehicle);
        ParkingLot parkingLot = new ParkingLot();
        ParkingSlot parkingSlot = parkingSlotAssignmentStrategy.assignParkingSlot(parkingLot, vehicle);

        ticket.setSlot(parkingSlot);

        return ticket;
    }
}
