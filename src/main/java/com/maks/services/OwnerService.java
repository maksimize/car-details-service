package com.maks.services;

import com.maks.domain.Owner;

import java.util.List;
import java.util.Optional;

public interface OwnerService {

    Optional<Owner> findById(Long id);

    List<Owner> findAll();
}
