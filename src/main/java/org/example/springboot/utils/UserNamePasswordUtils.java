package org.example.springboot.utils;

import org.apache.shiro.crypto.hash.SimpleHash;

/**
 * @author bailiang
 */
public class UserNamePasswordUtils {
    public static void main(String[] args) {
        int hashIterations = 3;
        String password = "123456";
        SimpleHash md5 = new SimpleHash("MD5", password, null, hashIterations);
        System.out.println(md5.toString());
    }
}
