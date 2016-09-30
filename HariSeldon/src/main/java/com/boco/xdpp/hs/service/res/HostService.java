package com.boco.xdpp.hs.service.res;  

import org.springframework.transaction.annotation.Transactional;  
import org.springframework.dao.DataAccessException;
 
public interface HostService {

    @Transactional(readOnly = true)  
    String readJson();
    
}  