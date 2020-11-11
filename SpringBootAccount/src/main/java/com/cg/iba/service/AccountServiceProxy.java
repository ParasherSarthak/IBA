package com.cg.iba.service;

import com.cg.iba.entities.Transaction;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.LowBalanceException;

public class AccountServiceProxy {
	
	IAccountService iAccountService;
	

	public IAccountService getiAccountService() {
		return iAccountService;
	}


	public void setiAccountService(IAccountService iAccountService) {
		this.iAccountService = iAccountService;
	}


	public Transaction transferMoney(long senderAccounId, long receiverAccountId, double amount,
			String username, String password) throws LowBalanceException, InvalidAccountException {
		
		Transaction transaction = iAccountService.transferMoney(senderAccounId, receiverAccountId, amount, username, password);
		return transaction;
		
	}
	
}
