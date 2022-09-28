package com.alan.community.util;

/**
 * @author Alan
 * @version 1.0
 * @date 2022/9/25 17:04
 */
public interface CommunityConstant {

    /**
     * 激活成功
     */
    int ACTIVATION_SUCCESS = 0;

    /**
     * 重复激活
     */
    int ACTIVATION_REPEAT = 1;

    /**
     * 激活失败
     */
    int ACTIVATION_FAILURE = 2;

    /**
     * 默认状态的登录凭证的超时时间 12h
     */
    int DEFAULT_EXPIRED_SECONDS = 3600 * 12;

    /**
     * 记住状态的登录凭证超时时间 100days
     */
    int REMEMBER_EXPIRED_SECONDS = 3600 * 24 *100;

}
