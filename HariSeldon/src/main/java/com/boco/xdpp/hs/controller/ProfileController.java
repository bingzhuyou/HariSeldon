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
@RequestMapping(value = "/profile.do")  
public class ProfileController extends BocoBaseController  {  
    @Autowired  
    private AccountService accountService;  
  
    @RequestMapping(method = RequestMethod.GET)  
    public String profile(@RequestParam("id") int id, ModelMap model) {  
        Account account = accountService.read(id);  
        model.addAttribute("account", account);  
  
        // 跳转到用户信息页面  
        return "account/profile";  
    }  
    
//    @SuppressWarnings("unchecked")
//	@ExceptionHandler(RuntimeException.class)  
//    public String runtimeExceptionHandler(RuntimeException runtimeException) {  
//       System.out.println(runtimeException.getLocalizedMessage());  
//  
//        return "404";  
//    } 
}  