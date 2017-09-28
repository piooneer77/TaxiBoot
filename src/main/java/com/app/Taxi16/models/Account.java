package com.app.Taxi16.models;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.Null;

@Entity
@Table( name = "accounts_tbl" )
public class Account implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int accountId;
    @Column(nullable = true)
    private String firstName;
    @Column(nullable = true)
    private String lastName;
    @Column(nullable = true)
    private String phone;
    @Column(nullable = true)
    private String email;
    @Column(nullable = true)
    private String magic;
    @Column(nullable = true)
    private int isOnTrip;
    @Column(nullable = true)
    private int isLocked;
    @Column(nullable = true)
    private int isDeleted;

    public Account() {
    }

    public Account(String firstName, String lastName, String phone, String email, String magic, int isOnTrip, int isLocked, int isDeleted) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.magic = magic;
        this.isOnTrip = isOnTrip;
        this.isLocked = isLocked;
        this.isDeleted = isDeleted;
    }

    public int getId() {
        return accountId;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMagic() {
        return magic;
    }

    public void setMagic(String magic) {
        this.magic = magic;
    }

    public int getAccountId() {
        return accountId;
    }

    public int getIsOnTrip() {
        return isOnTrip;
    }

    public void setIsOnTrip(int isOnTrip) {
        this.isOnTrip = isOnTrip;
    }

    public int getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(int isLocked) {
        this.isLocked = isLocked;
    }

    public int getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(int isDeleted) {
        this.isDeleted = isDeleted;
    }
}

