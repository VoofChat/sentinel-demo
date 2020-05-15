package com.voofchat.exception;

import com.alibaba.csp.sentinel.slots.block.BlockException;

/**
 * @author zhengzhixiong@baijiahulian.com
 * @date 2020/5/14
 * @time 12:08 PM
 * Description :
 */
public class ExceptionUtil {

    /**
     * @Description: 普通阻塞错误
     * @param:
     * @return:
     * @author: fanjc
     * @Date: 2019/5/10
     */
    public static String exceptionHandler(BlockException ex) {
        System.err.println("错误发生: " + ex.getClass().getCanonicalName());
        return "error";
    }

}
