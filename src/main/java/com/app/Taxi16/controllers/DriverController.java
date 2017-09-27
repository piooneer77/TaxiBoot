package com.app.Taxi16.controllers;

import com.app.Taxi16.business.DriverBusiness;
import com.app.Taxi16.models.Driver;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import javax.ws.rs.QueryParam;
import java.util.List;

@RestController
@RequestMapping(value = "/driver")
public class DriverController {

    @Autowired
    private DriverBusiness driverBusiness;

    @GetMapping(value = "/all" , produces = {"application/json", "application/xml"})
    public ResponseEntity<List<Driver>> getAll(){
        return new ResponseEntity<>(driverBusiness.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/magic/{user}/{magic}}" , produces = {"application/json", "application/xml"})
    public ResponseEntity<Driver> getAccountByMagic(@QueryParam("user") String user, @QueryParam("magic")String magic){
        return new ResponseEntity<>(driverBusiness.getDriverByMagic(user, magic), HttpStatus.OK);
    }

    @PostMapping(value = "/save", consumes = {"application/json", "application/xml"})
    public ResponseEntity<String> save(@RequestBody Driver driver){
        driverBusiness.save(driver);
        return new ResponseEntity<String>("Saved", HttpStatus.CREATED);
    }

    @PutMapping(value = "/update", consumes = {"application/json", "application/xml"})
    public ResponseEntity<String> update(@RequestBody Driver driver){
        driverBusiness.save(driver);
        return new ResponseEntity<String>("Saved", HttpStatus.OK);
    }

}
