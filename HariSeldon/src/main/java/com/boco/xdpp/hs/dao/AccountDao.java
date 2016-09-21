package com.boco.xdpp.hs.dao;  
  
import com.boco.xdpp.hs.domain.Account;  
  
public interface AccountDao {  
  
    Account read(String username);  
} 