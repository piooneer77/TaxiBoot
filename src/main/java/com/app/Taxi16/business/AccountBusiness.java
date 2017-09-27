package com.app.Taxi16.business;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.app.Taxi16.models.Account;
import com.app.Taxi16.repositories.AccountRepository;
import org.springframework.stereotype.Component;

@Component
public class AccountBusiness {

    @Autowired
	private final AccountRepository accountRepository;

    public AccountBusiness(AccountRepository accountRepository) {
		super();
		this.accountRepository = accountRepository;
	}
	
	public List<Account> getAll() {
		return accountRepository.findAll();
	}
	
	public Account getAccountByMagic(String user, String magic) {
		return accountRepository.findByUserNameAndMagic(user, magic);
	}
	
	public void save(Account account) {
		accountRepository.save(account);
	}
	
	public void Delete (int id) {
		accountRepository.delete(id);
	}
	
	public void Update(Account account) {
		accountRepository.save(account);
	}
	
}
