package com.mr.httpclient;

import com.mr.util.HttpClientUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lenovo on 2018/5/29.
 */
public class HttpClientDemo {
    @Test
    public void testGet(){
        String url="http://localhost:8080/employee/list";
        String result = HttpClientUtils.getContentFromUrl(url);
        System.out.println("get登录结果:"+result);
    }

    //发送post请求,form表单参数
    @Test
    public void testPost(){
        String url = "http://localhost:8080/employee/list";
        String charset = "utf-8";
        Map<String,String> loginMap = new HashMap<String,String>();
        loginMap.put("username","222");
        loginMap.put("password","222");
        String result = HttpClientUtils.doPost(url,loginMap,charset);
        System.out.println("post登录结果:"+result);
    }
}
