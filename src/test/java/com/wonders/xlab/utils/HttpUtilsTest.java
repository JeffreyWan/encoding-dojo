package com.wonders.xlab.utils;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class HttpUtilsTest {

    @Test
    public void testInvokePost() throws Exception {

        String url = "http://localhost:8080/recentMessage/post";
        Map<String,String> params = new HashMap<>();
        params.put("id", "22");
        params.put("name", "zhangsan");
//        params.put("data","{\"id\":\"22\",\"name\":\"zhangsan\"}");
        assertEquals("id = [" + "22" + "], name = [" + "zhangsan" + "]",HttpUtils.postMethod(url,params));
    }

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void testInvoke() throws Exception {
        String url = "";
        Map<String,Object> params = new HashMap<>();
        boolean isPost = false;
//        assertNotNull(!HttpUtils.invoke(url, params,isPost).isEmpty());

    }

    public String post(String url) throws IOException {
        HttpClient httpClient = HttpClients.createDefault();
        HttpPost postRequest = new HttpPost(
                /*"http://localhost:8080/RESTfulExample/json/product/post"*/url);

        StringEntity input = null;
        try {
            input = new StringEntity("{\"id\":100,\"name\":\"iPad 4\"}");
            input.setContentEncoding("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        input.setContentType("application/json");
        postRequest.setEntity(input);

        HttpResponse response = null;
        try {
            response = httpClient.execute(postRequest);
        } catch (IOException e) {
            e.printStackTrace();
        }

//        if (response.getStatusLine().getStatusCode() != 201) {
//            throw new RuntimeException("Failed : HTTP error code : "
//                    + response.getStatusLine().getStatusCode());
//        }

//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(
//                    new InputStreamReader((response.getEntity().getContent())));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        String output;
        System.out.println("Output from Server .... \n");
//        try {
//            while ((output = br.readLine()) != null) {
//                System.out.println(output);
//                return output;
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

//        httpClient.getConnectionManager().shutdown();

        return  EntityUtils.toString(response.getEntity());
    }

}