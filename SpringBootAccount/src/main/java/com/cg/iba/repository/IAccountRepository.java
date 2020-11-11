package com.cg.iba.repository;

import org.springframework.data.repository.CrudRepository;

import com.cg.iba.entities.Account;

public interface IAccountRepository extends CrudRepository<Account, Long> {
	
	
}