package com.boco.xdpp.hs.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boco.xdpp.hs.dao.AccountDao;
import com.boco.xdpp.hs.domain.Account;
import com.boco.xdpp.hs.service.AccountService;

@Service
@Transactional()
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDao;

	@Override
	public boolean verify(String username, String password) {

		Account account = accountDao.read(username);

		if (password.equals(account.getPassword())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Account read(String username, String password) {
		Account account = null;
		if (username.equals("snowolf") && password.equals("zlex")) {
			account = new Account(1);
			account.setUsername(username);
			account.setPassword(password);
		}
		return account;
	}

	@Override
	public Account read(int id) {
		Account account = new Account(1);
		account.setUsername("snowolf");
		account.setPassword("zlex");
		return account;
	}
}
