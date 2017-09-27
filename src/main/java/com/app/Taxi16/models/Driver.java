package com.app.Taxi16.models;

import java.io.File;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "drivers_tbl" )
public class Driver implements Serializable{
    
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String userName;
    private String magic;
    private String carMake;
    private String carType;
    private String carModelYear;
    private Boolean isACon;
    private String carPlateNumber;
    private String carPlateLetters;
    private File licenseImage;
    private File idImage;
    private File driverImage;
    private File carLicenseImage;
    private LocalDate carLicenseExpiryDate;
    private LocalDate licenseExpiryDate;

    public Driver() {
    }

    public Driver(String userName, String magic, String carMake, String carType, String carModelYear, Boolean isACon, String carPlateNumber, String carPlateLetters, File licenseImage, File idImage, File driverImage, File carLicenseImage, LocalDate carLicenseExpiryDate, LocalDate licenseExpiryDate) {
        this.userName = userName;
        this.magic = magic;
        this.carMake = carMake;
        this.carType = carType;
        this.carModelYear = carModelYear;
        this.isACon = isACon;
        this.carPlateNumber = carPlateNumber;
        this.carPlateLetters = carPlateLetters;
        this.licenseImage = licenseImage;
        this.idImage = idImage;
        this.driverImage = driverImage;
        this.carLicenseImage = carLicenseImage;
        this.carLicenseExpiryDate = carLicenseExpiryDate;
        this.licenseExpiryDate = licenseExpiryDate;
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public Boolean getACon() {
        return isACon;
    }

    public void setACon(Boolean ACon) {
        isACon = ACon;
    }

    public String getCarModelYear() {
        return carModelYear;
    }

    public void setCarModelYear(String carModelYear) {
        this.carModelYear = carModelYear;
    }

    public Boolean getIsACon() {
        return isACon;
    }

    public void setIsACon(Boolean isACon) {
        this.isACon = isACon;
    }

    public String getCarPlateNumber() {
        return carPlateNumber;
    }

    public void setCarPlateNumber(String carPlateNumber) {
        this.carPlateNumber = carPlateNumber;
    }

    public String getCarPlateLetters() {
        return carPlateLetters;
    }

    public void setCarPlateLetters(String carPlateLetters) {
        this.carPlateLetters = carPlateLetters;
    }

    public File getLicenseImage() {
        return licenseImage;
    }

    public void setLicenseImage(File licenseImage) {
        this.licenseImage = licenseImage;
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

    public LocalDate getLicenseExpiryDate() {
        return licenseExpiryDate;
    }

    public void setLicenseExpiryDate(LocalDate licenseExpiryDate) {
        this.licenseExpiryDate = licenseExpiryDate;
    }
    
    
}

