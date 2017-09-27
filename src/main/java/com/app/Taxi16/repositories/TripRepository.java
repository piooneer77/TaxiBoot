package com.app.Taxi16.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.app.Taxi16.models.Trip;


public interface TripRepository extends JpaRepository <Trip, Integer> {

}
