package com.maks.services;

import com.maks.domain.Car;
import com.maks.repositories.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public Car findCarById(Long id) {
        return this.carRepository.findById(id).get();
    }

    @Override
    public List<Car> findAllCars() {
        return this.carRepository.findAll();
    }

//    @Override
//    public List<Car> listCars(List<Long> ids) {
//        return this.carRepository.findListOfCars(ids);
//    }

    @Override
    public List<Car> getCarsByOwner(Long id) {
//        return this.carRepository.findByVehicleId("YS2R4X20005399401");
        return this.carRepository.findByOwnerId(id);
    }
}
