package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.domain.Person;
import com.example.demo.service.Personservice;

@SpringBootApplication
public class QuarynameApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(QuarynameApplication.class, args);
	}
	@Autowired
	   private Personservice service;
	@Override
	public void run(String... args) throws Exception {
		
		createPersons();
	}
	 private void findByLastName() {
	        List<Person> personList = service.findByLastName("kumar");
	        for(Person person : personList) {
	            System.out.println(person.toString());
	        }
	    }
	    
	    private void findByFirstNameOrLastName() {
	        List<Person> personList = service.findByFirstNameOrlastName("ram","krishna");
	        for(Person person : personList) {
	            System.out.println(person.toString());
	        }
	    }
	    public void createPersons() {
	        List<Person> personList = Arrays.asList(new Person(101, "ramesh", "thatikonda", "Ramesh@gmail.com","monday" ,"two"));
	                
	        
	        Iterable<Person> list = service.savePersondata(personList);
	            for(Person person : list) {
	                System.out.println("person object");
	            }
	    }

}
