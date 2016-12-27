package com.adobe.aempractice.impl;

import com.adobe.aempractice.MyService;

import org.apache.commons.lang3.*;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import java.util.logging.Logger;
@Component
@Service
public class MyserviceImpl implements MyService{
    static Logger logger = Logger.getLogger(MyserviceImpl.class.getName());
    void abc(){ 
    try{
        getResult("abc","abcxz");
        }
    catch(Exception e)
        {
        logger.info("Error is:"+e);
        }
    }

public String getResult(String s1, String s2) {
        String s =StringUtils.strip(s1, s2);
        return s;
    }
    
    public String name()
    {
        return "Hello World";
    }
}
