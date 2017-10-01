package com.app.Taxi16.models;

import java.io.File;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table( name = "drivers_tbl" )
public class Driver implements Serializable{
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int driversId;
	private String user;
    private String magic;
    private String latitude;
    private String longtitude;
    private String firstName;
    private String lastName;
    @Column(nullable = true)
    private String carMake;
    @Column(nullable = true)
    private String carType;
    @Column(nullable = true)
    private String carModelYear;
    @Column(nullable = true)
    private String isACon;
    @Column(nullable = true)
    private String carPlateNumbers;
    @Column(nullable = true)
    private String carPlateLetters;
    @Column(nullable = true)
    private File driversLicenseImage;
    @Column(nullable = true)
    private File idImage;
    @Column(nullable = true)
    private File driverImage;
    @Column(nullable = true)
    private File carLicenseImage;
    @Column(nullable = true)
    private LocalDate carLicenseExpiryDate;
    @Column(nullable = true)
    private LocalDate driversLicenseExpiryDate;

    public Driver() {
    }

    public Driver(String user, String magic, String latitude, String longtitude, String firstName, String lastName, String carMake, String carType, String carModelYear, String isACon, String carPlateNumbers, String carPlateLetters, File driversLicenseImage, File idImage, File driverImage, File carLicenseImage, LocalDate carLicenseExpiryDate, LocalDate driversLicenseExpiryDate) {
        this.user = user;
        this.magic = magic;
        this.latitude = latitude;
        this.longtitude = longtitude;
        this.firstName = firstName;
        this.lastName = lastName;
        this.carMake = carMake;
        this.carType = carType;
        this.carModelYear = carModelYear;
        this.isACon = isACon;
        this.carPlateNumbers = carPlateNumbers;
        this.carPlateLetters = carPlateLetters;
        this.driversLicenseImage = driversLicenseImage;
        this.idImage = idImage;
        this.driverImage = driverImage;
        this.carLicenseImage = carLicenseImage;
        this.carLicenseExpiryDate = carLicenseExpiryDate;
        this.driversLicenseExpiryDate = driversLicenseExpiryDate;
    }

    public int getDriversId() {
        return driversId;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongtitude() {
        return longtitude;
    }

    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public String getCarModelYear() {
        return carModelYear;
    }

    public void setCarModelYear(String carModelYear) {
        this.carModelYear = carModelYear;
    }

    public String getIsACon() {
        return isACon;
    }

    public void setIsACon(String isACon) {
        this.isACon = isACon;
    }

    public String getCarPlateNumbers() {
        return carPlateNumbers;
    }

    public void setCarPlateNumbers(String carPlateNumbers) {
        this.carPlateNumbers = carPlateNumbers;
    }

    public String getCarPlateLetters() {
        return carPlateLetters;
    }

    public void setCarPlateLetters(String carPlateLetters) {
        this.carPlateLetters = carPlateLetters;
    }

    public File getDriversLicenseImage() {
        return driversLicenseImage;
    }

    public void setDriversLicenseImage(File driversLicenseImage) {
        this.driversLicenseImage = driversLicenseImage;
    }

    public File getIdImage() {
        return idImage;
    }

    public void setIdImage(File idImage) {
        this.idImage = idImage;
    }

    public File getDriverImage() {
        return driverImage;
    }

    public void setDriverImage(File driverImage) {
        this.driverImage = driverImage;
    }

    public File getCarLicenseImage() {
        return carLicenseImage;
    }

    public void setCarLicenseImage(File carLicenseImage) {
        this.carLicenseImage = carLicenseImage;
    }

    public LocalDate getCarLicenseExpiryDate() {
        return carLicenseExpiryDate;
    }

    public void setCarLicenseExpiryDate(LocalDate carLicenseExpiryDate) {
        this.carLicenseExpiryDate = carLicenseExpiryDate;
    }

    public LocalDate getDriversLicenseExpiryDate() {
        return driversLicenseExpiryDate;
    }

    public void setDriversLicenseExpiryDate(LocalDate driversLicenseExpiryDate) {
        this.driversLicenseExpiryDate = driversLicenseExpiryDate;
    }
}

