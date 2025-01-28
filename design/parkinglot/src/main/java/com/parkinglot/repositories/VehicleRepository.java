package com.parkinglot.repositories;

import com.parkinglot.models.Vehicle;

import java.util.Collection;
import java.util.HashMap;
import java.util.Optional;

public class VehicleRepository {
    private HashMap<Long, Vehicle> vehicles = new HashMap<>();
    private Long ID = 0l;
    public Optional<Vehicle> findById(Long aId){
        return Optional.of(vehicles.get(aId));
    }

    public Optional<Vehicle> findByVehicleNumber(String aVehicleNumber){

        Collection<Vehicle> values = vehicles.values();
        for(Vehicle vehicle : values){
            String number = vehicle.getNumber();
            if(number.equals(aVehicleNumber)){
                return Optional.ofNullable(vehicle);
            }
        }

        return Optional.empty();
    }

    public Vehicle save(Vehicle vehicle) {
        if(vehicle.getId()==null){
            vehicle.setId(ID++);
        }
        vehicles.put(vehicle.getId(),vehicle);
        return vehicle;
    }
}
