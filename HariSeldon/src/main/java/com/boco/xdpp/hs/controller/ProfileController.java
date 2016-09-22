package com.boco.xdpp.hs.controller;  
  
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RequestParam;   
import org.springframework.web.bind.annotation.ResponseBody;

import com.boco.xdpp.hs.domain.Account;  
import com.boco.xdpp.hs.service.AccountService;  
  
/** 
 * 账户信息控制器 
 *  
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a> 
 * @version 1.0 
 * @since 1.0 
 */  
@Controller  
@RequestMapping(value = "/profile.do")  
public class ProfileController extends BocoBaseController  {  
    @Autowired  
    private AccountService accountService;  
  
    /** 
     * 账户信息展示 
     *  
     * @param id 
     * @param model 
     * @return 
     */  
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