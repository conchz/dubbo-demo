package org.lavenderx.dubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import org.lavenderx.dubbo.service.DemoService;

@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }
}
