/**
 * 
 */
package psa.springframework.services;

import org.springframework.stereotype.Service;

/**
 * Created by pyaesoneaung on 13/04/2020
 *
 */
@Service
public class SetterInjectedGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - Setter";
	}

}
