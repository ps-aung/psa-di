/**
 * 
 */
package psa.springframework.psadi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import psa.springframework.psadi.controllers.MyController;
import psa.springframework.psadi.controllers.PropertyInjectedController;
import psa.springframework.psadi.services.ConstructorGreetingService;

/**
 * Created by pyaesoneaung on 13/04/2020
 *
 */
class PropertyInjectedControllerTest {

	PropertyInjectedController controller;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		controller = new PropertyInjectedController();
		controller.greetingService = new ConstructorGreetingService();
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void greeting() {
		System.out.println(controller.getGreeting());
	}

}
