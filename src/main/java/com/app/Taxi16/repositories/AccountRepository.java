package com.app.Taxi16.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.app.Taxi16.models.Account;
import org.springframework.data.repository.CrudRepository;


public interface AccountRepository extends JpaRepository<Account, Integer> {

    Account findAccountByEmailAndMagic(String email, String magic);
}
