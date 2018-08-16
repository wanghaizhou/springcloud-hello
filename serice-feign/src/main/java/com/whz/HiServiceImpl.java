package com.whz;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by wanghaizhou on 2018/8/10.
 */
@FeignClient(value = "SERVER-HI",fallback=HiServiceImplImpl.class)
public interface HiServiceImpl {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    String geta(@RequestParam(value = "name") String name);

    @RequestMapping(value = "hi2",method = RequestMethod.GET)
    String geta2(@RequestParam(value = "name") String name);

}
