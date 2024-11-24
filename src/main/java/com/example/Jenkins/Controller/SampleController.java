package com.example.Jenkins.Controller;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {


    private static final Log log = LogFactory.getLog(SampleController.class);

    @GetMapping("/hello")
    public String sayHello(){
        log.info("Application has been started");
        return "Hello World!";
    }

    @GetMapping("/test")
    public String sayTest(){
        return "test";
    }

    @GetMapping("/dummy")
    public String dummy(){
        return "dummy";
    }
}
