package io.jjenksi.john.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by johnjenkins on 7/17/17.
 */
@RestController
public class ServiceController {

    @Value("${service.instance.name}")
    private String instance;


    @RequestMapping("/")
    public String message(){
        return "Hello from " + instance;
    }
}
