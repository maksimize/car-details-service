package com.maks.services;

import com.maks.domain.Car;
import com.maks.domain.Owner;
import com.maks.repositories.CarRepository;
import com.maks.repositories.OwnerRepository;
import org.hibernate.annotations.Where;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OwnerServiceImpl implements OwnerService {

    private OwnerRepository ownerRepository;

    public OwnerServiceImpl(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    @Override
    public Optional<Owner> findById(Long id) {
        return this.ownerRepository.findById(id);
    }

    @Override
    public List<Owner> findAll() {
        return ownerRepository.findAll();
    }

}
