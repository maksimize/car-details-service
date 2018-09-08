package com.maks.controllers;

import com.maks.domain.Car;
import com.maks.domain.Owner;
import com.maks.services.CarService;
import com.maks.services.OwnerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//@CrossOrigin(origins = "http://domain2.com", maxAge = 3600)
@CrossOrigin
@RequestMapping(CarController.BASE_URL)
public class CarController {
    static final String BASE_URL = "api/v1/cars";

    private final CarService carService;
    private final OwnerService ownerService;

    public CarController(CarService carService, OwnerService ownerService) {
        this.carService = carService;
        this.ownerService = ownerService;
    }

//    @GetMapping
//    @CrossOrigin
//    List<Owner> getAllCars(){
//        return this.ownerService.findAll();
//    }

    @GetMapping("/owner")
    List<Owner> byOwner(){
        return this.ownerService.findAll();
    }

    @GetMapping("owner/{id}")
    Owner byOwnerId(@PathVariable long id){
        return this.ownerService.findById(id);
    }



    @GetMapping("test/{ids}")
    List<Owner> test(@PathVariable List<Long> ids){
        return this.ownerService.findByIds(ids);
    }


//    @GetMapping("vehicle/{ids}")
//    List<Owner> byVehicleId(@PathVariable List<Long> ids){
//        return this.ownerService.findByVehicleId(ids);
//    }



//    @GetMapping("list/{ids}")
//    List<Car> getCarsList(@PathVariable List<Long> ids){
//        return this.carService.listCars(ids);
//    }


//    @GetMapping("{id}")
//    List<Car> getCar(@PathVariable Long id){
//        return this.carService.getCarsByOwner(id);
//    }

//    @GetMapping("owner/{id}")
//    Owner getOwnerCars(@PathVariable long id){
//        return this.ownerService.findById(id);
//    }

}
