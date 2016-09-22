package com.boco.xdpp.hs.dao.impl;  
  
import org.springframework.stereotype.Repository; 

import java.sql.ResultSet;  
import java.sql.SQLException;  
 
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  

import com.boco.xdpp.hs.dao.AccountDao;  
import com.boco.xdpp.hs.domain.Account;  
  
@Repository  
public class AccountDaoImpl implements AccountDao {  
  
	@Autowired  
    private JdbcTemplate jdbcTemplate;  
  
    @SuppressWarnings("unchecked")
	@Override  
    public Account read(String username) {  
        String sql = "SELECT * From account WHERE username = ?";  
        return (Account) jdbcTemplate.queryForObject(sql,  
                new Object[] { username }, accountRowMap);  
    }  

    @SuppressWarnings("unchecked")
    @Override  
    public Account read(int id) {  
        String sql = "SELECT * From account WHERE id = ?";  
        return (Account) jdbcTemplate.queryForObject(sql, new Object[] { id },  
                accountRowMap);  
    }  

    @SuppressWarnings("rawtypes")
    protected RowMapper accountRowMap = new RowMapper() {  
        @Override  
        public Object mapRow(ResultSet rs, int rowNum) throws SQLException {  
            Account account = new Account();  
            account.setId(rs.getInt("id"));  
            account.setUsername(rs.getString("username"));  
            account.setPassword(rs.getString("password"));  
            account.setPhone(rs.getString("phone"));  
            account.setEmail(rs.getString("email"));  
            return account;  
        }  
    }; 
    
    @Override  
    public void create(Account account) {  
        String sql = "INSERT INTO account(username, password, phone, email) VALUES(?,?,?,?)";  
  
        jdbcTemplate.update(sql, new Object[] { account.getUsername(),  
                account.getPassword(), account.getPhone(),  
                account.getEmail() });  
    }
  
}  