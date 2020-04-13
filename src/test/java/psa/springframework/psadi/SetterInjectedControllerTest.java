/**
 * 
 */
package psa.springframework.psadi;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import psa.springframework.psadi.controllers.SetterInjectedController;
import psa.springframework.psadi.services.ConstructorGreetingService;

/**
 * Created by pyaesoneaung on 13/04/2020
 *
 */
class SetterInjectedControllerTest {

	SetterInjectedController controller;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		controller = new SetterInjectedController();
		controller.setGreetingService(new ConstructorGreetingService());
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
