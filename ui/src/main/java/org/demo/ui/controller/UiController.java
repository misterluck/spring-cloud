package org.demo.ui.controller;

import org.demo.ui.domain.Person;
import org.demo.ui.service.PersonHystrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UiController {

    @Autowired
    private PersonHystrixService personHystrixService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<Person> save(String name) {
        System.out.println("****************"+name);
        return personHystrixService.save(name);
    }

}
