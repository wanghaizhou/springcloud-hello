package com.whz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wanghaizhou on 2018/8/10.
 */
@RestController
public class TestController {

    @Autowired
    HiServiceImpl hiService;


    @GetMapping(value = "hi")
    public String hi(@RequestParam String name){
        return hiService.geta(name);
    }

    @GetMapping(value = "hi22")
    public String hi2(@RequestParam String name){
        return hiService.geta2(name);
    }

}
