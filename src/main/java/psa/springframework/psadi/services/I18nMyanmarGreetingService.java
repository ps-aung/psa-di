/**
 * 
 */
package psa.springframework.psadi.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by pyaesoneaung on 13/04/2020
 *
 */
@Profile({"MM","default"})
@Service("i18nService")
public class I18nMyanmarGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "မင်္ဂလာပါ- မြန်မာ";
	}

}
