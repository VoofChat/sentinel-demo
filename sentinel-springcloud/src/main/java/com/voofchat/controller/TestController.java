package com.voofchat.controller;

/**
 * @author zhengzhixiong@baijiahulian.com
 * @date 2020/5/14
 * @time 12:06 PM
 * Description :
 */
import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.voofchat.exception.ExceptionUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController  {

    @SentinelResource(value = "test1",blockHandler = "exceptionHandler", blockHandlerClass = { ExceptionUtil.class })
    @GetMapping(value = "/test1")
    public String test1()  {
        log.info(" -- test1 -- ");
        return "success";

    }

    @SentinelResource(value = "test2",blockHandler = "exceptionHandler", blockHandlerClass = { ExceptionUtil.class })
    @GetMapping(value = "/test2")
    public String test2()  {

        log.info(" -- test2 -- ");
//        try {
//            Thread.sleep(1 * 1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        return "success";

    }


}