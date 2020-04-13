/**
 * 
 */
package psa.springframework.psadi.services;

import org.springframework.stereotype.Service;

/**
 * Created by pyaesoneaung on 13/04/2020
 *
 */
@Service
public class ConstructorGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - Constructor";
	}

}
