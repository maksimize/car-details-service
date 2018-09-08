package com.maks.repositories;

import com.maks.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CarRepository extends JpaRepository<Car, Long> {
    List<Car> findByVehicleId(String id);

    List<Car> findByOwnerId(Long id);

//    @Query("SELECT t.registration_number FROM Car t where t.id IN :ids")
//    List<Car> findListOfCars(@Param("ids") List<Long> ids);

}
