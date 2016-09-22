package com.boco.xdpp.hs.controller;  
  
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  

import com.boco.xdpp.hs.service.AccountService;  
  
@Controller  
@RequestMapping("/account.do")  
public class AccountController  extends BocoBaseController  {  
  
    @Autowired  
    private AccountService accountService;  
  
 //   no annotion method
//    @RequestMapping(method = RequestMethod.GET)  
//    public void hello(HttpServletRequest request, HttpServletResponse response)  
//            throws Exception {  
//  
//        String username = ServletRequestUtils.getRequiredStringParameter(  
//                request, "username");  
//        String password = ServletRequestUtils.getRequiredStringParameter(  
//                request, "password");  
//        System.out.println(accountService.verify(username, password));  
//    }  
    
    @SuppressWarnings("rawtypes")
	@RequestMapping(method = RequestMethod.GET)  
    public Map hello(String username, String password, ModelMap model) { 
    	if (username==null ||  password==null) {
            model.put("msg", " username or password is null.");  
    	}
    	else {
            if (accountService.verify(username, password)) {
                model.put("msg", username + " verify ok. ");  
            }
            else {
                model.put("msg", username + " verify fail. ");  
            }
    	}
        return model;  
    }  
}  