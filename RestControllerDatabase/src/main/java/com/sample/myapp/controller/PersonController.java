package com.sample.myapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sample.myapp.dto.Person;
import com.sample.myapp.service.PersonService;


@RestController
public class PersonController {
	
	// 이 어노테이션 하나로 서비스와의 매핑이 자동으로 처리된다.
	@Autowired
	private PersonService service;
	
	@GetMapping(path="/test")
	public Person personTest() {
		Person person = new Person();
		person.setId(3);
		person.setName("yoo");
		person.setJob("sales");
		return person;
	}
	
	@GetMapping(path="/persons")
	public List<Person> getPersons(){
		return service.getPersons();
	}

}
