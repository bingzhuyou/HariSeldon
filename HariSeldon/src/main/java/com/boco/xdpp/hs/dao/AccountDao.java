package com.boco.xdpp.hs.dao;  
  
import com.boco.xdpp.hs.domain.Account;  
  
public interface AccountDao {  
  
    Account read(String username);  
    Account read(int id); 
    
    void create(Account account);
} 