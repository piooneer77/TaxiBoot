package com.app.Taxi16.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "trips_tbl" )
public class Trip implements Serializable{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int driver;
	private int account;
    private String source;
    private String destination;
    private String rateToDriver;
    private String rateToClient;
    private Boolean isACon;
    
	public Trip() {
		super();
	}

	
	
	public Trip(int driver, int account, String source, String destination, String rateToDriver, String rateToClient,
			Boolean isACon) {
		super();
		this.driver = driver;
		this.account = account;
		this.source = source;
		this.destination = destination;
		this.rateToDriver = rateToDriver;
		this.rateToClient = rateToClient;
		this.isACon = isACon;
	}



	public int getId() {
		return id;
	}

	public int getDriver() {
		return driver;
	}

	public void setDriver(int driver) {
		this.driver = driver;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRateToDriver() {
		return rateToDriver;
	}

	public void setRateToDriver(String rateToDriver) {
		this.rateToDriver = rateToDriver;
	}

	public String getRateToClient() {
		return rateToClient;
	}

	public void setRateToClient(String rateToClient) {
		this.rateToClient = rateToClient;
	}

	public Boolean getIsACon() {
		return isACon;
	}

	public void setIsACon(Boolean isACon) {
		this.isACon = isACon;
	}
    
    
    
    
    
}
