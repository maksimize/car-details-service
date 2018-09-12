package com.maks.controllers;

import com.maks.domain.Owner;
import com.maks.services.OwnerService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(CarController.BASE_URL)
public class CarController {
    static final String BASE_URL = "api/v1/cars";

    private final OwnerService ownerService;

    public CarController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @GetMapping("/owner")
    List<Owner> byOwner() {
        return this.ownerService.findAll();
    }

    @GetMapping("owner/{id}")
    Owner byOwnerId(@PathVariable long id) {
        return this.ownerService.findById(id).get();
    }


}
