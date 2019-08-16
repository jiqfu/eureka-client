package com.hand.eurekaclient.api.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * description
 * </p>
 *
 * @author fu.ji@hand-china.com 2019/08/16 13:52
 */
@RestController
@RequestMapping("/v1")
public class TestController {
    @Value("${server.port}")
    private String port;

    @GetMapping("/info")
    public String queryInfo(@RequestParam(name = "name", defaultValue = "ming") String name) {
        return name + "你好！这里是" + port;
    }


}
