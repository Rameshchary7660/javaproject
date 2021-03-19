package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.persondao;
import com.example.demo.domain.Person;

@Service
public class Personservice {
	@Autowired
	private persondao dao;
	public List<Person>findByLastName(String lastName) {
		
		return dao.findByLastName(lastName);
		
	}
	public Iterable<Person>savePersondata(List<Person> personList){
		return dao.saveAll(personList);
		
	}
	public List<Person>findByFirstNameOrlastName(String firstName, String lastName){
		return dao.findByFirstNameOrLastName(firstName,lastName);
	}

}
