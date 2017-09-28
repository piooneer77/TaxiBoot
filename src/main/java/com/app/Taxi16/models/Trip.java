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
	private int tripId;
	private int driversId;
	private int accountId;
    private String tripSource;
    private String tripDestination;
    private String tripRateToDriver;
    private String tripRateToClient;
    private int tripIsACon;

	public Trip() {
	}

    public Trip(int driversId, int accountId, String tripSource, String tripDestination, String tripRateToDriver, String tripRateToClient, int tripIsACon) {
        this.driversId = driversId;
        this.accountId = accountId;
        this.tripSource = tripSource;
        this.tripDestination = tripDestination;
        this.tripRateToDriver = tripRateToDriver;
        this.tripRateToClient = tripRateToClient;
        this.tripIsACon = tripIsACon;
    }

    public int getTripId() {
        return tripId;
    }

    public int getDriversId() {
        return driversId;
    }

    public void setDriversId(int driversId) {
        this.driversId = driversId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getTripSource() {
        return tripSource;
    }

    public void setTripSource(String tripSource) {
        this.tripSource = tripSource;
    }

    public String getTripDestination() {
        return tripDestination;
    }

    public void setTripDestination(String tripDestination) {
        this.tripDestination = tripDestination;
    }

    public String getTripRateToDriver() {
        return tripRateToDriver;
    }

    public void setTripRateToDriver(String tripRateToDriver) {
        this.tripRateToDriver = tripRateToDriver;
    }

    public String getTripRateToClient() {
        return tripRateToClient;
    }

    public void setTripRateToClient(String tripRateToClient) {
        this.tripRateToClient = tripRateToClient;
    }

    public int getTripIsACon() {
        return tripIsACon;
    }

    public void setTripIsACon(int tripIsACon) {
        this.tripIsACon = tripIsACon;
    }
}
