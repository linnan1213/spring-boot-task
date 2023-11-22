package com.example.task.tasks;

import com.example.task.utils.DateUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller //将此类托管给spring 不能省略
public class TaskPrint {

    //添加定时任务
    @Scheduled(cron = "0/60 * * * * ?")
    public void print(){
        System.out.println(DateUtils.getTime() + ":打印定时任务！");
    }

}
