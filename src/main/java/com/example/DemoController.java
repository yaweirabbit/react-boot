package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yaweihu on 29/1/17.
 */
@RestController
public class DemoController {
    @RequestMapping(value = "/echo")
    public String echo(@RequestParam(value = "request", defaultValue = "Hello!") String request) {
        return request;
    }
}
