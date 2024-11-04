package com.axity.coachspringdemo.democursojavaspring.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.axity.coachspringdemo.democursojavaspring.Models.Person;


@RestController
public class PersonRESTController {

    @RequestMapping("/rest")
	public String healthCheck() {
		return "OK";
	}

    @RequestMapping("/rest/person/get")
	public Person getPerson(@RequestParam(name = "name", required = false, defaultValue = "Unknown") String name) {
		Person person = new Person();
		person.setName(name);
		return person;
	}
}
