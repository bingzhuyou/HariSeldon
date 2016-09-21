package com.boco.xdpp.hs.dao.impl;  
  
import org.springframework.stereotype.Repository;  
import com.boco.xdpp.hs.dao.AccountDao;  
import com.boco.xdpp.hs.domain.Account;  
  
@Repository  
public class AccountDaoImpl implements AccountDao {  
  
    @Override  
    public Account read(String username) {  
       
        return new Account(username,"wolf");  
    }  
  
}  