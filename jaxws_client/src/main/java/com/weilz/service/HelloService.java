package com.weilz.service;

import javax.jws.WebService;

/**
 * @Author: alphago
 * @Date: 2019/3/7 21:35
 * @Version 1.0
 * 对外发布服务的接口
 */
@WebService
public interface HelloService {
    /**
     * 对外发布服务的接口的方法
     */
    String sayHello(String name);
}
