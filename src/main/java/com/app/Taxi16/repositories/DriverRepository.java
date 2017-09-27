package com.app.Taxi16.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import com.app.Taxi16.models.Driver;


public interface DriverRepository extends JpaRepository<Driver, Integer> {
    Driver findByUserNameAndMagic(String user, String magic);
}
