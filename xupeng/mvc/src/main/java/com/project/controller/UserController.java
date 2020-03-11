package com.project.controller;

import com.project.vo.UserVO;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("register.lovo")
    public String register(UserVO userVO){

        //post提交到后端
        //1、创建httpclient
        HttpClient httpClient=HttpClients.createDefault();
        //创建post请求
        HttpPost post=new HttpPost("http://localhost:8080/ss/register.lovo");
        //post放入参数
        List<BasicNameValuePair> listParm=new ArrayList<>();
        listParm.add(new BasicNameValuePair("name",userVO.getName()));
        listParm.add(new BasicNameValuePair("pwd",userVO.getPwd()));
        listParm.add(new BasicNameValuePair("age",String.valueOf(userVO.getAge())));

        try {
            post.setEntity(new UrlEncodedFormEntity(listParm,"utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //执行psot请求
        try {
            HttpResponse httpResponse=  httpClient.execute(post);
            HttpEntity entity=    httpResponse.getEntity();
            String result=    EntityUtils.toString(entity,"utf-8");
           return  result;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  "";
    }
}
