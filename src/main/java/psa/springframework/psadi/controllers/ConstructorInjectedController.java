/**
 * 
 */
package psa.springframework.psadi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import psa.springframework.psadi.services.GreetingService;

/**
 * Created by pyaesoneaung on 13/04/2020
 *
 */
@Controller
public class ConstructorInjectedController {
	
	private final GreetingService greetingService;

	/**
	 * @param greetingService
	 */
	public ConstructorInjectedController(@Qualifier("constructorGreetingService")GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String getGreeting() {
		return greetingService.sayGreeting();
	}

}
