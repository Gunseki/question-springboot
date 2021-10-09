package com.gunseki.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sample")
public class SampleController {

    @GetMapping("/")
    public String hoge() {
        return "hoge";
    }

    @GetMapping("/fuga")
    public String fuga() {
        return "fugaaaaaaaaaaaddddasdfas";
    }


}
