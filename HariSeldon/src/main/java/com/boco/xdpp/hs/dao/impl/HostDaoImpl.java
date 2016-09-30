package com.boco.xdpp.hs.dao.impl;  
  
import java.util.Base64;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository; 
import org.springframework.web.client.RestTemplate;

//import java.sql.ResultSet;  
//import java.sql.SQLException;  
//
//import org.springframework.beans.factory.annotation.Autowired;  
//import org.springframework.jdbc.core.JdbcTemplate;  
//import org.springframework.jdbc.core.RowMapper;  






import com.boco.xdpp.hs.dao.HostDao;  
  
@Repository  
public class HostDaoImpl implements HostDao {  
//  
//	@Autowired  
//    private JdbcTemplate jdbcTemplate;  
  
    @SuppressWarnings("unchecked")
	@Override  
    public String getHostLists(String url, String uname, String pwd) {
    	String plainCreds = uname + ":" + pwd;
    	byte[] plainCredsBytes = plainCreds.getBytes();
    	byte[] base64CredsBytes = Base64.getEncoder().encode(plainCredsBytes);
    	String base64Creds = new String(base64CredsBytes);

    	HttpHeaders headers = new HttpHeaders();
    	headers.add("Authorization", "Basic " + base64Creds);
    	
    	HttpEntity<String> request = new HttpEntity<String>(headers);
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, request, String.class);
		
		System.out.println(response.toString());
    	
        return "";  
    }
}  