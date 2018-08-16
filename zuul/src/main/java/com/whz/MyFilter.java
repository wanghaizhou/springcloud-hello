package com.whz;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Created by wanghaizhou on 2018/8/10.
 */
@Component
public class MyFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        System.out.println(String.format("%s >>>>> %s",request.getMethod(),request.getRequestURL().toString()));
        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)){
            try {
                requestContext.setSendZuulResponse(false);
                requestContext.setResponseStatusCode(401);
                requestContext.getResponse().getWriter().write("miss token!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }
}
