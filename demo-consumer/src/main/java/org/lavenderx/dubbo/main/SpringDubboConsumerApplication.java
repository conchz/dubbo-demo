package org.lavenderx.dubbo.main;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringDubboConsumerApplication implements CommandLineRunner {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SpringDubboConsumerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("服务调用者------>>启动完毕");
    }
}
