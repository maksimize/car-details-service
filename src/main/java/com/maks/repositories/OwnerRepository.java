package com.maks.repositories;

import com.maks.domain.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    List<Owner> findByIdIn(List<Long> ids);

//    List<Owner> findByCarVehicleIdIn(List<Long> ids);
}
