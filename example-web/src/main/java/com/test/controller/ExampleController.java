package com.test.controller;

import first.FExampleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 测试
 */
@Controller
@RequestMapping("/exampleController")
public class ExampleController {

    private final static Logger logger = LoggerFactory.getLogger(ExampleController.class);


    @Autowired
    private FExampleService fExampleService;

    @RequestMapping("/testPost")
    @ResponseBody
    public Object testPost(HttpServletRequest request){
        String  ip = request.getHeader("HTTP_X_FORWARDED_FOR");
        logger.info("--------------->来了一个请求"+ip);
        Map<String,Object> map = new HashMap<String,Object>(1);
        map.put("json","mysjson");
        return map;
    }
}
