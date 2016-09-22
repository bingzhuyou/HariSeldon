package com.boco.xdpp.hs;  
  
import static org.junit.Assert.*;
import org.junit.Test;  
import org.springframework.beans.factory.annotation.Autowired;  

import com.boco.xdpp.hs.dao.AccountDao;  
import com.boco.xdpp.hs.domain.Account;  
  
public class AccountDaoTest extends AbstractTestCase {  
  
    @Autowired  
    private AccountDao accountDao;  
  
    @Test  
    public void test() {  
        Account ac = new Account();  
        ac.setPhone("13988888888");  
        ac.setUsername("SPRING");  
        ac.setPassword("SNOWOLF");  
        ac.setEmail("spring@zlex.org");  
  
        // 创建用户  
        accountDao.create(ac);  
  
        // 检索  
        Account account = accountDao.read("SPRING");  
  
        // 校验  
        assertNotNull(account);  
    }  
  
}  