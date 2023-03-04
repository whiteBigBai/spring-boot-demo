package org.example.springboot.cors;

import org.springframework.http.HttpStatus;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author bailiang
 */
public class CorsUtils {

    public static void setHeader(HttpServletRequest req, HttpServletResponse res) {
        res.setHeader("Access-Control-Allow-Origin", req.getHeader("Origin"));
        res.setHeader("Access-Control-Allow-Headers", req.getHeader("Access-Control-Request-Headers"));
        res.setHeader("Access-Control-Allow-Methods", "OPTIONS,HEAD,DELETE,GET,PUT,POST");
        res.setHeader("Access-Control-Max-Age", "1728000");
        res.setHeader("Content-Type", "application/json;charset=UTF-8");
        res.setStatus(HttpStatus.OK.value());
    }
}
