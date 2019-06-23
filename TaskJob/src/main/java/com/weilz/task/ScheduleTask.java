package com.weilz.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @Author: alphago
 * @Date: 2019/3/19 18:46
 * @Version 1.0
 */
@Component
public class ScheduleTask {

    // 每隔5秒执行一次
    @Scheduled(cron = "0/5 * * * * ?")
    public void printSay() {
        System.out.println("每隔5秒执行一次：" + new Date());
    }
    // 每隔10秒执行一次
    @Scheduled(cron = "0/10 * * * * ?")
    public void printWrite(){
        System.out.println("每隔10秒执行一次：" + new Date());
    }

}

