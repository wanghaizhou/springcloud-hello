package com.whz;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wanghaizhou on 2018/8/10.
 */
@Service
public class TestService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "error")
    public String getString(String name){
        return restTemplate.getForObject("http://SERVER-HI/hi?name="+name,String.class);
    }

    public String error(String name){
        return "sorry,"+name+",server is fail";
    }

}
