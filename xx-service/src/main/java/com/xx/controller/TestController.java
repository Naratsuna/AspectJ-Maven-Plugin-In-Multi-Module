package com.xx.controller;

import com.xx.utils.ApiUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/requestOtherApi")
    public String requestOtherApi() {
        return ApiUtil.requestApi("Mock Params");
    }

}
