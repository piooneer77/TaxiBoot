package com.app.Taxi16.business;


import org.springframework.beans.factory.annotation.Autowired;

import com.app.Taxi16.repositories.DriverRepository;


public class DriverBusiness {
	
	@Autowired
	private final DriverRepository driverRepository;
	
	public DriverBusiness(DriverRepository driverRepository) {
		super();
		this.driverRepository = driverRepository;
	}
		
	
	
}
