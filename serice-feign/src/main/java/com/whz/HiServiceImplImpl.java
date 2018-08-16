package com.whz;

import org.springframework.stereotype.Component;

/**
 * Created by wanghaizhou on 2018/8/10.
 */
@Component
public class HiServiceImplImpl implements HiServiceImpl {
    @Override
    public String geta(String name) {
        return "sorry,"+name+", the server was fell";
    }

    @Override
    public String geta2(String name) {
        return "sorry,"+name+", the server was fell";
    }
}
