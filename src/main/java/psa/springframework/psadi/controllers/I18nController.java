/**
 * 
 */
package psa.springframework.psadi.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

import psa.springframework.psadi.services.GreetingService;

/**
 * Created by pyaesoneaung on 13/04/2020
 *
 */
@Controller
public class I18nController {
	
	private final GreetingService greetingService;

	/**
	 * @param greetingService
	 */
	public I18nController(@Qualifier("i18nService")GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	

}
