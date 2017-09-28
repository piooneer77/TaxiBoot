package com.app.Taxi16.business;


import com.app.Taxi16.models.Driver;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.Taxi16.repositories.DriverRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DriverBusiness {
	
	@Autowired
	private final DriverRepository driverRepository;
	
	public DriverBusiness(DriverRepository driverRepository) {
		super();
		this.driverRepository = driverRepository;
	}

	public List<Driver> getAll() {
		return driverRepository.findAll();
	}

	public Driver getDriverByMagic(String user, String magic) {
		return driverRepository.findByUserAndMagic(user, magic);
	}

	public void save(Driver driver) {
		driverRepository.save(driver);
	}

	public void Update(Driver driver) {
		driverRepository.save(driver);
	}


}
