package com.boco.xdpp.hs.controller;

import java.util.Map;
import java.util.TreeMap;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

public class BocoBaseController {
	
    @SuppressWarnings("unchecked")
	@ExceptionHandler(RuntimeException.class)  
    public String runtimeExceptionHandler(RuntimeException runtimeException) {  
       System.out.println(runtimeException.getLocalizedMessage());  
  
        return "404";  
    } 
	
//	@SuppressWarnings("unchecked")
//	@ExceptionHandler(RuntimeException.class)  
//    public @ResponseBody  
//    Map<String,Object> runtimeExceptionHandler(RuntimeException runtimeException) {  
////        logger.error(runtimeException.getLocalizedMessage());  
//  
//        @SuppressWarnings("rawtypes")
//		Map model = new TreeMap();  
//        model.put("status", false);  
//        return model;  
//    } 
	
//	@ExceptionHandler(RuntimeException.class)  
//    public String runtimeExceptionHandler2(RuntimeException runtimeException,  
//            ModelMap modelMap) {  
////        logger.error(runtimeException.getLocalizedMessage());  
//  
//        modelMap.put("status", runtimeException.getLocalizedMessage());  
//        return "exception";  
//    } 
}
