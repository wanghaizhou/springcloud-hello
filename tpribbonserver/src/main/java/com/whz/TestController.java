package com.whz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wanghaizhou on 2018/8/10.
 */

@RestController
public class TestController {

    @Autowired
    RestTemplate restTemplate;
    @Autowired
    TestService testService;

    @RequestMapping("/hi")
    public String hi(@RequestParam(name = "name",defaultValue = "haha") String name){
        return testService.getString(name);
    }

}
