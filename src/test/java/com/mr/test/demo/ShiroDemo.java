package com.mr.test.demo;

import org.apache.shiro.crypto.hash.Md5Hash;

/**
 * Created by lenovo on 2018/5/29.
 */
public class ShiroDemo {

    public static void main(String[] args) {
        String password = "111";
        //md5直接加密
        Md5Hash md5Hash = new Md5Hash(password);
        System.out.println(md5Hash);

        //MD5+盐值：加密
        String name = "111";
        Md5Hash md5 = new Md5Hash(password,name);
        System.out.println(md5);

        Md5Hash md5hashIterations = new Md5Hash(password,name ,1000 );
        System.out.println(md5hashIterations);
    }

}
