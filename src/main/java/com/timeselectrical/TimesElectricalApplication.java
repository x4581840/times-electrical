package com.timeselectrical;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.timeselectrical.mapper")
//@EnableScheduling
public class TimesElectricalApplication {

    public static void main(String[] args) {
        SpringApplication.run(TimesElectricalApplication.class, args);
    }

}
