package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Person;

@Repository
public interface persondao extends JpaRepository<Person, Integer>{
	List<Person> findByLastName(String lastName);
	List<Person> findByFirstNameOrLastName(String firstName,String lastName);
	
	

}
