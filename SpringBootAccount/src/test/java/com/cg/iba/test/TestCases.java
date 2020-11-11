package com.cg.iba.test;

import static org.junit.Assert.assertNotNull;

import org.easymock.EasyMock;
import org.junit.Test;

import com.cg.iba.entities.Transaction;
import com.cg.iba.exception.InvalidAccountException;
import com.cg.iba.exception.LowBalanceException;
import com.cg.iba.service.AccountServiceProxy;
import com.cg.iba.service.IAccountService;

public class TestCases {

	IAccountService iAccountService = EasyMock.createMock(IAccountService.class);
	AccountServiceProxy account = new AccountServiceProxy();
	Transaction transaction = new Transaction();
	
	@Test
	public void transferTestMoney() throws LowBalanceException, InvalidAccountException {
		EasyMock.expect(iAccountService.transferMoney(8615, 007, 2100, "789", "987")).andReturn(transaction);
		EasyMock.replay(iAccountService);
		account.setiAccountService(iAccountService);
		Transaction transfer = account.transferMoney(8615, 007, 2100, "789", "987");
		assertNotNull(transfer);
	}
	
}
