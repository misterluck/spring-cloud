package org.demo.ui.service;

import org.demo.ui.domain.Person;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@FeignClient(value = "person")
public interface PersonService {

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    List<Person> save(@RequestBody String name);

}
