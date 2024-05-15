package com.springboot.Project1.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class HelloController {

@CrossOrigin("http://localhost:8082")
@RequestMapping("/hello")
public Map<String, String> hello() {
    Map<String, String> map = new HashMap<>();
    map.put("status","200");
    map.put("msg","성공");
    return map;
    }

}

