package com.whz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wanghaizhou on 2018/8/15.
 */
@RestController
public class TpController1 {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/info1")
    public String info1(@RequestParam(name = "name",defaultValue = "haha") String name){
        return restTemplate.getForObject("http://localhost:8616/info2",String.class);
    }

    @RequestMapping("/info2")
    public String info2(@RequestParam(name = "name",defaultValue = "haha") String name){
        return restTemplate.getForObject("http://localhost:8615/testinfo",String.class);
    }

    @RequestMapping("/testinfo")
    public String testinfo(@RequestParam(name = "name",defaultValue = "haha") String name){
        return "请求成功"+name;
    }

}
