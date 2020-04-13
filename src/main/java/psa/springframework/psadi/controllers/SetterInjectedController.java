/**
 * 
 */
package psa.springframework.psadi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import psa.springframework.psadi.services.GreetingService;

/**
 * Created by pyaesoneaung on 13/04/2020
 *
 */
@Controller
public class SetterInjectedController {
	
	public GreetingService greetingService;
	
	@Qualifier("setterInjectedGreetingService")
	@Autowired
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
