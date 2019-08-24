package com.hly.coreDesignPatterns.strategyPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :hly
 * @github :https://github.com/huangliangyun
 * @blog :http://www.javahly.com/
 * @CSDN :blog.csdn.net/Sirius_hly
 * @date :2019/8/24
 * @QQ :1136513099
 * @desc :
 */
public class PayStrategy {

    public static final String ALI_PAY = "AliPay";
    public static final String WECHAT_PAY = "WechatPay";
    public static final String DEFAULT_PAY = "WechatPay";

    private static Map<String,Payment> payStrategy = new HashMap<>();

    static {
        payStrategy.put(ALI_PAY,new AliPay());
        payStrategy.put(WECHAT_PAY,new WeChatPay());
    }

    public static Payment get(String paykey){

        if(!payStrategy.containsKey(paykey)){
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(paykey);

    }
}
