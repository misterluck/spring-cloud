package org.demo.some.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SomeController {

    @Value(value = "${some.message}")
    private String message;

    @RequestMapping(value = "/message")
    public String message() {
        return message;
    }

}
