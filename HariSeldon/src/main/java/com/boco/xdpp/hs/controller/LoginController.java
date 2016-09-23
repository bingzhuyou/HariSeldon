package com.boco.xdpp.hs.controller;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  

import com.boco.xdpp.hs.domain.Account;  
import com.boco.xdpp.hs.service.AccountService;  
  

@Controller  
@RequestMapping(value = "/login.do")  
public class LoginController  extends BocoBaseController {  
  
    @Autowired  
    private AccountService accountService;  
  
    @RequestMapping(method = RequestMethod.GET)  
    public String initForm(ModelMap model) {  
        Account account = new Account();  
        model.addAttribute("account", account);  
        // 直接跳转到登录页面  
        return "account/login";  
    }  
  
    @RequestMapping(method = RequestMethod.POST)  
    public String login(@ModelAttribute("account") Account account) {  
        Account acc = accountService.read(account.getUsername(), account  
                .getPassword()); 
        System.out.println("user name : " + account.getUsername() + ",  pwd : " +  account.getPassword() + " . verify" + accountService.verify(account.getUsername(), account.getPassword()));  
                
        if (acc != null) {   
        	System.out.println("new user name : " + acc.getUsername() + ",  pwd : " +  acc.getPassword() + " . verify" + accountService.verify(acc.getUsername(), acc.getPassword()));  
            return "redirect:foundation.do?id=" + acc.getId();  
        } else {  
       	 	System.out.println("account is null . " );
            return "redirect:login.do";  
        }  
    }  
}  