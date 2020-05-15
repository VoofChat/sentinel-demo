package com.voofchat.util;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * @author zhengzhixiong@baijiahulian.com
 * @date 2020/5/14
 * @time 2:07 PM
 * Description :
 */
public class HttpUtil {

    private static String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36";

    public static String sendGet(String url) {
        try {
            HttpResponse<String> response = Unirest.get(url).header("User-Agent", USER_AGENT).asString();
            return response.getBody();
        } catch (UnirestException e) {
            System.out.println("HTTP Get Error:" + e);
        }
        return "";
    }
}
