package com.timeselectrical.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


@Component
public class MyTask {

    //@Scheduled(cron = "0/10 * * * * *")
    public void work() {
        System.out.println("Mytask executor.......");
    }
}
