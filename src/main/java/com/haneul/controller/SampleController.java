package com.haneul.controller;

import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Log4j
public class SampleController {
    @GetMapping("/")
    public void hello(){
        log.info("hello............");
        log.info(".................");
    }
}
