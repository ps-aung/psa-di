/**
 * 
 */
package psa.springframework.psadi.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * Created by pyaesoneaung on 13/04/2020
 *
 */
@Primary
@Service
public class PrimaryGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello World - From the PRIMARY Bean";
	}

}
