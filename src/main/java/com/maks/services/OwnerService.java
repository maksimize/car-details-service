package com.maks.services;

import com.maks.domain.Car;
import com.maks.domain.Owner;

import java.util.List;

public interface OwnerService {

    Owner findById(Long id);

    List<Owner> findAll();

    List<Owner> findByIds(List<Long> ids);

//    List<Owner> findByVehicleId(List<Long> ids);
}
