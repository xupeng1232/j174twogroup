package com.project.controller;

import com.project.vo.InfoVO;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class InfoController {
    @RequestMapping("addInfo.lovo")
    public void addInfo(String userId,InfoVO infoVO){

        //post提交到后端
        //1、创建httpclient
        HttpClient httpClient= HttpClients.createDefault();
        //创建post请求
        HttpPost post=new HttpPost("http://localhost:8080/ss/addInfo.lovo");
        //post放入参数
        List<BasicNameValuePair> listParm=new ArrayList<>();
        listParm.add(new BasicNameValuePair("job",infoVO.getJob()));
        listParm.add(new BasicNameValuePair("money",String.valueOf(infoVO.getMoney())));
        listParm.add(new BasicNameValuePair("userId",userId));

        try {
            post.setEntity(new UrlEncodedFormEntity(listParm,"utf-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        //执行psot请求
        try {
            HttpResponse httpResponse=  httpClient.execute(post);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
