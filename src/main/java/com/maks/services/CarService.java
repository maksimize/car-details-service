package com.maks.services;

import com.maks.domain.Car;

import java.util.List;

public interface CarService {

    Car findCarById(Long id);

    List<Car> findAllCars();

    List<Car> getCarsByOwner(Long id);
}
