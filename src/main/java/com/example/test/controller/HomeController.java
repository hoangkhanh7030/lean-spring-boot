package com.example.test.controller;

import com.example.test.entity.Persion;
import com.example.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class HomeController {
    @Autowired
    private TestService  testService ;
    @GetMapping(value = "/home")
    public List<Persion> home(){
        return testService.getAll();
    }
}
