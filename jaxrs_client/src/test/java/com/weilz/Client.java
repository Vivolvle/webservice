package com.weilz;

import com.weilz.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;
import org.junit.Test;

import javax.ws.rs.core.MediaType;

/**
 * @Author: alphago
 * @Date: 2019/3/8 16:12
 * @Version 1.0
 */
public class Client {

    @Test
    public void testSave(){
        //通过WebClient对象远程调用对象
        User user=new User();
        user.setId(3);
        user.setUsername("Obama");
        user.setCity("newYork");
        WebClient
                .create("http://localhost:8001/ws/userService/user")
                .type(MediaType.APPLICATION_JSON_TYPE)
                .post(user);
    }

    @Test
    public void testGet(){
        User user = WebClient.create("http://localhost:8001/ws/userService/user/1")
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .get(User.class);
        System.out.println(user.toString());
    }

    @Test
    public void testPut(){
        User user = new User();
        user.setId(2);
        user.setUsername("newName");
        user.setCity("newCity");
        WebClient.create("http://localhost:8001/ws/userService/user")
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .put(user);
    }

    @Test
    public void testGetList(){
        String result = WebClient.create("http://localhost:8001/ws/userService/user")
                .accept(MediaType.APPLICATION_JSON_TYPE)
                .get(String.class);
        System.out.println(result);
    }

    @Test
    public void testDelete(){
        WebClient.create("http://localhost:8001/ws/userService/user/1")
                .delete();
    }

}
