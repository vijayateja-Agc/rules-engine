package com.app.service;

import org.kie.api.runtime.KieContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;





@Service
public class DroolService {
	
	@Autowired
	private  KieContainer kieContainer;
	
	
	 public com.app.model.Person getPerson(com.app.model.Person person) {
	        org.kie.api.runtime.KieSession kieSession = kieContainer.newKieSession("personSession");
	        kieSession.insert(person);
	        kieSession.fireAllRules();
	        kieSession.dispose();
	        return person;
	    }

}
