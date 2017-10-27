package org.lavenderx.dubbo.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.lavenderx.dubbo.service.DemoService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumer implements CommandLineRunner {

    @Reference
    private DemoService demoService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Starting call method");
        demoService.sayHello();
        System.out.println("Calling end");
    }
}
