/**
 * 
 */
package psa.springframework.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import psa.springframework.examplebeans.FakeDataSource;

/**
 * Created by pyaesoneaung on 21/04/2020
 *
 */
@Configuration
@PropertySource({"classpath:datasource.properties"})
public class PropertyConfig {
	
	@Value("${psa.username}")
	String user;
	
	@Value("${psa.password}")
	String password;
	
	@Value("${psa.dburl}")
	String url;
	
	
	@Bean
	public FakeDataSource FakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(user);
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}


	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		
		PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertyPlaceholderConfigurer;
		
	}

}
