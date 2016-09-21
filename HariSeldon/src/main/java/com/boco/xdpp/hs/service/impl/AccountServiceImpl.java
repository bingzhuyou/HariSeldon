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
  
}  
