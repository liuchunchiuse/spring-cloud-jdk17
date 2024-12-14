package com.liuchunchi.test.gateway.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/nacos")
@RestController
public class NacosConfigController {

    @Value("${liuchunchi.desc}")
    private String desc;


    @GetMapping("/config")
    public String getConfig() {
        return desc;
    }


}
