package com.parkinglot.repositories;

import com.parkinglot.models.Gate;
import com.parkinglot.models.enums.GateType;

import java.util.HashMap;
import java.util.Optional;

public class GateRepository {
    private HashMap<Long, Gate> gates = new HashMap();

//    {
//        Gate gate = new Gate();
//        gate.setId(123L);
//        gate.setGateType(GateType.ENTRY);
//
//        gates.put(gate.getId(),gate);
//    }

    public Optional<Gate> findByGateId(Long aId){
       return Optional.ofNullable(gates.get(aId));
    }
}
