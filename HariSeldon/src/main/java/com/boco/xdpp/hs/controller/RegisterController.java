package com.boco.xdpp.hs.controller;  
 
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Controller;  
import org.springframework.ui.ModelMap;  
import org.springframework.web.bind.WebDataBinder;  
import org.springframework.web.bind.annotation.InitBinder;  
import org.springframework.web.bind.annotation.ModelAttribute;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  

import com.boco.xdpp.hs.domain.Account;  
import com.boco.xdpp.hs.service.AccountService;  
  
/** 
 * 用户注册控制器 
 *  
 * @author <a href="mailto:zlex.dongliang@gmail.com">梁栋</a> 
 * @version 1.0 
 * @since 1.0 
 */  
@Controller  
@RequestMapping(value = "/register.do")  
public class RegisterController  extends BocoBaseController {  
  
    @Autowired  
    private AccountService accountService;  
  
    @InitBinder  
    public void initBinder(WebDataBinder binder) {  
        // 忽略字段绑定异常  
        // binder.setIgnoreInvalidFields(true);  
  
//        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");  
//        binder.registerCustomEditor(Date.class, "birthday",  
//                new CustomDateEditor(format, true));  
    }  
  
    @RequestMapping(method = RequestMethod.GET)  
    public String initForm(ModelMap model) {  
        Account account = new Account();  
        model.addAttribute("account", account);  
        // 直接跳转到登录页面  
        return "account/register";  
    }  
  
    @RequestMapping(method = RequestMethod.POST)  
    protected String submit(@ModelAttribute("account") Account account) {  
        int id = accountService.register(account).getId();  
        // 跳转到用户信息页面  
        return "redirect:profile.do?id=" + id;  
    }  
}  