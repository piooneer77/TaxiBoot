package com.app.Taxi16.business;


import com.app.Taxi16.models.Driver;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.Taxi16.repositories.DriverRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DriverBusiness {
	
	@Autowired
	private DriverRepository driverRepository;

	public List<Driver> getAll() {
		return driverRepository.findAll();
	}

	public Driver findDriverByUserAndMagic(String user, String magic) {
		return driverRepository.findDriverByUserAndMagic(user, magic);
	}

	public void save(Driver driver) {
		driverRepository.save(driver);
	}

	public void Update(Driver driver) {
		driverRepository.save(driver);
	}


}
