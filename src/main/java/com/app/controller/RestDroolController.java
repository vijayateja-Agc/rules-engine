package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Person;
import com.app.service.DroolService;

@RestController
public class RestDroolController {
	
	
	@Autowired
	private DroolService droolService;
	
	
	@RequestMapping(value = "/person", 
            method = RequestMethod.GET)
	public ResponseEntity<Person> getRulesAppliedPerson(@RequestParam(required = true) int age){
		
		Person person = new Person();
		person.setpAge(age);
		Person ruleAPlied = droolService.getPerson(person);
		person.setpState(ruleAPlied.getpState());
		
		
		return new ResponseEntity<Person>(person,HttpStatus.OK);
		
	}

}
