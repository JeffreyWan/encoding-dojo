package com.wonders.xlab.utils;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicHeader;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Jeffrey on 2015/4/16.
 */
public class HttpUtils {

    public static String invoke(String url, Map<String, Object> params, boolean isPost) {

        return "";
    }

    public static String postMethod(String url, Map<String, String> params) {
        /*create HttpClient*/
        HttpClient httpClient = HttpClients.createDefault();
        HttpEntity httpEntity;

        /*null params throw an Exception*/
        if (StringUtils.isBlank(url) || null == params || params.isEmpty())
            throw new IllegalArgumentException("参数不能为空");

//        List<NameValuePair> nvps = new ArrayList<>();
//        /*解析post方法的请求参数*/
//        for (Map.Entry<String, String> entry : params.entrySet()) {
//            String key = entry.getKey();
//            Object value = entry.getValue();
//            /*请求参数为单字符串*/
//            if (null != value && value instanceof String && !value.equals("")) {
//                nvps.add(new BasicNameValuePair(key, value.toString()));
//            }
//            /*请求参数为字符串数组*/
//            else if (null != value && value instanceof String[] && ((String[]) value).length > 0) {
//                for (String param : (String[]) value) {
//                    nvps.add(new BasicNameValuePair(key, (String) param));
//                }
//            }
//        }
        try {
            HttpPost httpPost = postForm(url,params);
//            UrlEncodedFormEntity entity = new UrlEncodedFormEntity(nvps,"UTF-8");
////            StringEntity stringEntity = new StringEntity("{\"id\":\"22\",\"name\":\"zhangsan\"}");
////            entity.setContentType("application/json");
//            JSONObject jsonObj = new JSONObject();
//            try {
//                jsonObj.put("id", "22");
//                jsonObj.put("name", "zhangsan");
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }


//            StringEntity stringEntity = new StringEntity(jsonObj.toString());
//            System.out.println("jsonObj = " + jsonObj.toString());

//            stringEntity.setContentType(new BasicHeader("Content-Type","application/json"));
//            stringEntity.setContentType("application/json");
//            stringEntity.setContentEncoding("UTF-8");
//            httpPost.setEntity(en);
            HttpResponse response = httpClient.execute(httpPost);
            return EntityUtils.toString(response.getEntity());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }

    private static HttpPost postForm(String url, Map<String, String> params){

        HttpPost httpost = new HttpPost(url);
        List<NameValuePair> nvps = new ArrayList <>();

        Set<String> keySet = params.keySet();
        for(String key : keySet) {
            nvps.add(new BasicNameValuePair(key, params.get(key)));
        }

        try {
//            log.info("set utf-8 form entity to httppost");
            httpost.setEntity(new UrlEncodedFormEntity(nvps, HTTP.UTF_8));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return httpost;
    }
}
