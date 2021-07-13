package com.quickapply.quickapply;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class QuickApplyApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickApplyApplication.class, args);
        log.info("Execution success");
    }

}
