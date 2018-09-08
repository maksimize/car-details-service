package com.maks.services;

import com.maks.domain.Car;
import com.maks.domain.Owner;
import com.maks.repositories.CarRepository;
import com.maks.repositories.OwnerRepository;
import org.hibernate.annotations.Where;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {

    private CarRepository carRepository ;
    private OwnerRepository ownerRepository;

    public OwnerServiceImpl(CarRepository carRepository, OwnerRepository ownerRepository) {
        this.carRepository = carRepository;
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Owner findById(Long id) {
        return this.ownerRepository.findById(id).get();
    }


    @Override
    public List<Owner> findAll() {
        return ownerRepository.findAll();
    }

    @Override
    public List<Owner> findByIds(List<Long> ids) {
        return this.ownerRepository.findByIdIn(ids);
    }

//    @Override
//    public List<Owner> findByVehicleId(List<Long> ids) {
//        return this.ownerRepository.findByCarVehicleIdIn(ids);
//    }
}
