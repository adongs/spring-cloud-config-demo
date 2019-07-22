package com.adongs.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author yudong
 * @Date 2019/7/22 下午3:35
 * @Version 1.0
 */
@RestController
public class TestController {


    @Value("${dome.name}")
    private String name;

    @GetMapping("test")
    public String test(){
        return name;
    }

}
