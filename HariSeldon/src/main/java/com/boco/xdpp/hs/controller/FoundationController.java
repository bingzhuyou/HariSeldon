package com.boco.xdpp.hs.controller;  
  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RequestParam;   

import com.boco.xdpp.hs.domain.Account;  
import com.boco.xdpp.hs.service.AccountService;  
  
@Controller  
@RequestMapping(value = "/foundation.do")  
public class FoundationController extends BocoBaseController  {  
    @Autowired  
    private AccountService accountService;  
  
    @RequestMapping(method = RequestMethod.GET)  
    public String profile(@RequestParam("id") int id, ModelMap model) {  
        Account account = accountService.read(id);  
        model.addAttribute("account", account);  
  
        return "foundation";  
    }  
}  