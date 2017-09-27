package com.app.Taxi16.business;


import org.springframework.beans.factory.annotation.Autowired;

import com.app.Taxi16.repositories.TripRepository;


public class TripBusiness {
    
	@Autowired
	private final TripRepository tripRepository;
	
	public TripBusiness(TripRepository tripRepository) {
		super();
		this.tripRepository = tripRepository;
	}
	
	
	
}
