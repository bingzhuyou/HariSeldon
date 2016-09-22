package com.boco.xdpp.hs.service;  

import org.springframework.transaction.annotation.Transactional;  
import org.springframework.dao.DataAccessException;
import com.boco.xdpp.hs.domain.Account;
 
public interface AccountService {
	
	@Transactional(readOnly = true)
    boolean verify(String username, String password);
	
    @Transactional(readOnly = true)
    Account read(String username, String password);
    
    @Transactional(readOnly = true)  
    Account read(int id);
    
    @Transactional(readOnly = false, rollbackFor = DataAccessException.class)  
    Account register(Account account);  
    
}  