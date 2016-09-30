package com.boco.xdpp.hs.dao;  
  
import com.boco.xdpp.hs.domain.Account;  
  
public interface HostDao {  
  
    String getHostLists(String url, String uname, String pwd);  
    
//    void add(Host newHost);
} 