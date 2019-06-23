package com.weilz.server;

import java.nio.charset.Charset;
import java.util.HashSet;

/**
 * @Author: alphago
 * @Date: 2019/3/13 9:26
 * @Version 1.0
 */
public class Util {
    public static Charset charset = Charset.forName("UTF-8");

    // 相当于自定义协议格式，与客户端协商好
    public static String USER_CONTENT_SPILIT = "#@#";

    // 用来记录在线人数，以及昵称
    public static HashSet<String> users = new HashSet<String>();
    public static String USER_EXIST = "system message: user exist, please change a name";
}
