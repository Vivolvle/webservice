package com.weilz.service.Impl;

import com.weilz.service.HelloService;

/**
 * @Author: alphago
 * @Date: 2019/3/7 21:38
 * @Version 1.0
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return name+",Welcome to hello world";
    }
}
