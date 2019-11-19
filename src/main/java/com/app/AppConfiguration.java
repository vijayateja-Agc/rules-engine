package com.app;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication 
@ComponentScan({"com.app.controller","com.app.service"})
public class AppConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(AppConfiguration.class,args);
	}
	
	@Bean
    public KieContainer kieContainer() {
        return KieServices.Factory.get().getKieClasspathContainer();
    }

}
