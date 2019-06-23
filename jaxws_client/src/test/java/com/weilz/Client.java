package com.weilz;

import com.weilz.service.HelloService;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * @Author: alphago
 * @Date: 2019/3/7 21:56
 * @Version 1.0
 */
public class Client {
    public static void main(String[] args) {
        //服务接口地址

        //创建cxf代理工厂
        JaxWsProxyFactoryBean factory=new JaxWsProxyFactoryBean();
        //设置远程服务的地址 class com.sun.proxy.$Proxy34 [java代理，1：静态代理，2：动态代理（jdk接口代理，cglib子类代理）]
        factory.setAddress("http://localhost:8000/ws/hello");
        //设置接口类型
        factory.setServiceClass(HelloService.class);
        //对接口生成代理对象
        HelloService helloService = factory.create(HelloService.class);
        //代理对象类型
        System.out.println(helloService.getClass());
        //远程访问服务端方法
        String content = helloService.sayHello("魏良政");
        System.out.println(content);
    }
}
