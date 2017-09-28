package com.app.Taxi16.controllers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.app.Taxi16.business.AccountBusiness;
import com.app.Taxi16.models.Account;
import javax.ws.rs.QueryParam;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
	private AccountBusiness accountBusiness;
    
	@GetMapping(value = "/all" , produces = {"application/json", "application/xml"})
    public ResponseEntity<List<Account>> getAll(){
		return new ResponseEntity<>(accountBusiness.getAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/magic/{email}/{magic}" , produces = {"application/json", "application/xml"})
    public ResponseEntity<Account> getAccountByMagic(@PathVariable("email") String email, @PathVariable("magic")String magic){
        return new ResponseEntity<>(accountBusiness.getAccountByMagic(email, magic), HttpStatus.OK);
    }
	
	@PostMapping(value = "/save", consumes = {"application/json", "application/xml"})
    public ResponseEntity<String> save(@RequestBody Account account){
        accountBusiness.save(account);
		return new ResponseEntity<String>("Saved", HttpStatus.CREATED);
    }

    @PutMapping(value = "/update", consumes = {"application/json", "application/xml"})
    public ResponseEntity<String> update(@RequestBody Account account){
        accountBusiness.save(account);
        return new ResponseEntity<String>("Saved", HttpStatus.OK);
    }
    
}
