/**
 * 
 */
package psa.springframework.psadi;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import psa.springframework.psadi.controllers.ConstructorInjectedController;
import psa.springframework.services.ConstructorGreetingService;

/**
 * Created by pyaesoneaung on 13/04/2020
 *
 */
class ConstructorInjectedControllerTest {

	ConstructorInjectedController controller;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		controller = new ConstructorInjectedController(new ConstructorGreetingService());
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void getGreeting() {
		System.out.println(controller.getGreeting());
	}

}
