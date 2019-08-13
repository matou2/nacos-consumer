package com.zixia.consumer.controller;

import com.zixia.consumer.feign.ProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author teng.wang1.o
 * @date 2019/8/9
 * @Description
 */
@RestController
public class ConsumerController {
    @Autowired
    private ProviderClient providerClient;

    @GetMapping("hello")
    public String testProviderFeign(String name){
        System.out.println("消费者开始调用提供者提供的接口服务。。。。");
        return providerClient.hello(name);
    }

}
