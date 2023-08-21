package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class denemeclass {

@GetMapping("/hi")
public String sayhi(){return "welcome your server runing";}


}
