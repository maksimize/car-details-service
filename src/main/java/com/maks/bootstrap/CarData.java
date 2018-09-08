package com.maks.bootstrap;

import com.maks.domain.Car;
import com.maks.domain.Owner;
import com.maks.repositories.CarRepository;
import com.maks.repositories.OwnerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarData implements CommandLineRunner{

    private CarRepository carRepository;
    private OwnerRepository ownerRepository;

    public CarData(CarRepository carRepository, OwnerRepository ownerRepository) {
        this.carRepository = carRepository;
        this.ownerRepository = ownerRepository;
    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("Loading Car data");

        // Owner 1
        Owner o1 = new Owner();
        o1.setName("Kalles Grustransporter AB");
        o1.setAddress("Cementvägen 8, 111 11 Södertälje");
        this.ownerRepository.save(o1);

        Car c1 = new Car();
        c1.setOwner(o1);
        c1.setVehicleId("YS2R4X20005399401");
        c1.setRegistrationNumber("ABC123");
        this.carRepository.save(c1);

        Car c2 = new Car();
        c2.setOwner(o1);
        c2.setVehicleId("VLUR4X20009093588");
        c2.setRegistrationNumber("DEF456");
        this.carRepository.save(c2);

        Car c3 = new Car();
        c3.setOwner(o1);
        c3.setVehicleId("VLUR4X20009048066");
        c3.setRegistrationNumber("GHI789");
        this.carRepository.save(c3);


        // Owner 2
        Owner o2 = new Owner();
        o2.setName("Johans Bulk AB");
        o2.setAddress("Balkvägen 12, 222 22 Stockholm");
        this.ownerRepository.save(o2);

        Car c4 = new Car();
        c4.setOwner(o2);
        c4.setVehicleId("YS2R4X20005388011");
        c4.setRegistrationNumber("JKL012");
        this.carRepository.save(c4);

        Car c5 = new Car();
        c5.setOwner(o2);
        c5.setVehicleId("YS2R4X20005387949");
        c5.setRegistrationNumber("MNO345");
        this.carRepository.save(c5);



        // Owner 3
        Owner o3 = new Owner();
        o3.setName("Haralds Värdetransporter AB");
        o3.setAddress("Budgetvägen 1, 333 33 Uppsala");
        this.ownerRepository.save(o3);

        Car c6 = new Car();
        c6.setOwner(o3);
        c6.setVehicleId("VLUR4X20009048066");
        c6.setRegistrationNumber("PQR678");
        this.carRepository.save(c6);

        Car c7 = new Car();
        c7.setOwner(o3);
        c7.setVehicleId("YS2R4X20005387055");
        c7.setRegistrationNumber("STU901");
        this.carRepository.save(c7);


        System.out.println("=> number of Cars" + this.carRepository.count());
    }
}
