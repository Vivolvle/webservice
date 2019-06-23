package com.weilz.server;

/**
 * @Author: alphago
 * @Date: 2019/3/13 9:28
 * @Version 1.0
 */
public class Loader {
    public static void main(String[] args) {
        Deamon deamon = new Deamon(9999);
        new Thread(deamon).start();
    }
}
