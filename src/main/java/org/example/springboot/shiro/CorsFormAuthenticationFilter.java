package org.example.springboot.shiro;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.util.WebUtils;
import org.example.springboot.common.Result;
import org.example.springboot.cors.CorsUtils;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * @author bailiang
 */
public class CorsFormAuthenticationFilter extends FormAuthenticationFilter {


    public CorsFormAuthenticationFilter() {
        super();
    }


    @Override
    public boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        HttpServletRequest req = WebUtils.toHttp(request);
        HttpServletResponse res = (HttpServletResponse) response;
        CorsUtils.setHeader(req, res);
        //设置跨域
        if (StringUtils.equals(RequestMethod.OPTIONS.name(), req.getMethod().toUpperCase())) {
            return true;
        }
        return super.isAccessAllowed(request, response, mappedValue);
    }


    @Override
    protected boolean onAccessDenied(ServletRequest request, ServletResponse response) throws Exception {
        HttpServletResponse res = (HttpServletResponse) response;
        res.setStatus(HttpServletResponse.SC_OK);
        res.setCharacterEncoding("UTF-8");
        PrintWriter writer = res.getWriter();
        Result result = new Result(401, "请先登录", null);
        writer.write(JSON.toJSONString(result));
        writer.close();
        return false;
    }
}