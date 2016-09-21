package com.boco.xdpp.hs.service;  

import com.boco.xdpp.hs.domain.Account;
 
public interface AccountService {  
    boolean verify(String username, String password);  
    Account read(String username, String password);
    Account read(int id);
}  