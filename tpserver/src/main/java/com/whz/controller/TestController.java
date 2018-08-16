package com.whz.controller;

import com.whz.bean.People;
import com.whz.bean.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanghaizhou on 2018/8/9.
 */
@RestController
@EnableConfigurationProperties({People.class})
public class TestController {

    @Autowired
    People people;

//    @Value("${my.name}")
    @Value("${my.name}")
    private String name;

//    @Value("${environment}")
    private String environment;

    @Autowired
    TestBean testBean;

    @RequestMapping("test")
    public String test1(){
        System.out.println("control中输出testBean:"+testBean);
        System.out.println("control中输出environment:"+environment);
        System.out.println("control中输出people:"+people);
        System.out.println("control中输出name:"+name);
        return "test";
    }

}
