package com.sample.myapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.myapp.dao.PersonDAO;
import com.sample.myapp.dto.Person;

@Service
public class PersonServiceImpl implements PersonService {

	@Autowired
	private PersonDAO dao;
	
	@Override
	public List<Person> getPersons() {
		return dao.getPersons();
	}

}
