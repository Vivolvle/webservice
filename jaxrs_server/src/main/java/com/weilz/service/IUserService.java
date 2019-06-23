package com.weilz.service;

import com.weilz.entity.User;

import javax.ws.rs.*;
import java.util.List;

/**
 * @Author: alphago
 * @Date: 2019/3/8 14:29
 * @Version 1.0
 */
//访问当前服务接口对应的路径
@Path("/userService")
@Produces("*/*")    //服务器支持的返回的数据格式类型
public interface IUserService {
    //表示处理的请求的类型，post对应的是insert新增操作
    @POST
    //访问当前接口方法对应的路径
    @Path("/user")
    //服务器支持的请求的数据格式类型
    @Consumes({"application/xml","application/json"})
    void saveUser(User user);
    //表示处理的请求的类型，put对应的是update修改操作
    @PUT
    @Path("/user")
    @Consumes({"application/xml","application/json"})
    void updateUser(User user);
    //表示处理的请求的类型，get对应的是查询操作
    @GET
    @Path("/user")
    //服务器支持的返回的数据格式类型
    @Produces({"application/xml","application/json"})
    List<User> findAllUsers();

    @GET
    @Path("/user/{id}")
    @Consumes({"application/xml"})
    @Produces({"application/xml","application/json"})
    User findUserById(@PathParam("id") Integer id);
    //表示处理的请求的类型，delete对应的是删除操作
    @DELETE
    @Path("/user/{id}")
    @Consumes({"application/xml","application/json"})
    void deleteUser(@PathParam("id") Integer id);
}
