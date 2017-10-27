package org.lavenderx.dubbo.main;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringDubboProviderApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringDubboProviderApplication.class, args);
        try {
            Thread.currentThread().join();
        } catch (InterruptedException e) {
            log.error("Abnormal shutdown dubbo provider", e);
        }
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("服务提供者------>>启动完毕");
    }
}
