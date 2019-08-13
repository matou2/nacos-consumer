package com.zixia.consumer.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author teng.wang1.o
 * @date 2019/8/9
 * @Description
 */
@FeignClient("nacos-provider")
public interface ProviderClient {
    @GetMapping("/hello")
    String hello(@RequestParam(value = "name",required = false)String name);
}
