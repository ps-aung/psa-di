/**
 * 
 */
package psa.springframework.psadi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import psa.springframework.services.GreetingService;

/**
 * Created by pyaesoneaung on 13/04/2020
 *
 */

@Controller
public class PropertyInjectedController {
	
	@Qualifier("propertyInjectedGreetingService")
	@Autowired
	public GreetingService greetingService;
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
