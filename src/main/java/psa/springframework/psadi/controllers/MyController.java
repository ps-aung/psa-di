/**
 * 
 */
package psa.springframework.psadi.controllers;

import org.springframework.stereotype.Controller;

import psa.springframework.psadi.services.GreetingService;

/**
 * Created by pyaesoneaung on 13/04/2020
 *
 */
@Controller
public class MyController {
	
	private final GreetingService greetingService;
	
	
	
	/**
	 * @param greetingService
	 */
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
