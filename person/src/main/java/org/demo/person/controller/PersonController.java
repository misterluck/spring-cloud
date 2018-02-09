package org.demo.person.controller;

import org.demo.person.domain.Person;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public List<Person> save(@RequestBody String name) {
        System.out.println("************************person"+name);
        List<Person> list = new ArrayList<>();
        Person person1 = new Person("130210312", "3216629521", "*#06#$2@7&", name);
        Person person2 = new Person("130210310", "876170926", "*#06#$2@7&", name);
        list.add(person1);
        list.add(person2);
        return list;
    }

}
