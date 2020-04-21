/**
 * 
 */
package psa.springframework.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import psa.springframework.examplebeans.FakeDataSource;
import psa.springframework.examplebeans.FakeOther;

/**
 * Created by pyaesoneaung on 21/04/2020
 *
 */
@Configuration
@PropertySources({
	@PropertySource({"classpath:datasource.properties"}),
	@PropertySource({"classpath:other.properties"})
})
public class PropertyConfig {
	
	@Autowired
	Environment env;
	
	@Value("${psa.username}")
	String user;
	
	@Value("${psa.password}")
	String password;
	
	@Value("${psa.dburl}")
	String url;
	
	@Value("${ths.username}")
	String otheruser;
	
	@Value("${ths.password}")
	String otherpassword;
	
	@Value("${ths.dburl}")
	String otherurl;
	
	
	
	@Bean
	public FakeDataSource FakeDataSource() {
		FakeDataSource fakeDataSource = new FakeDataSource();
		fakeDataSource.setUser(env.getProperty("Username"));
		fakeDataSource.setPassword(password);
		fakeDataSource.setUrl(url);
		return fakeDataSource;
	}
	
	@Bean
	public FakeOther FakeOther() {
		FakeOther fakeOther = new FakeOther();
		fakeOther.setUser(otheruser);
		fakeOther.setPassword(otherpassword);
		fakeOther.setUrl(otherurl);
		return fakeOther;
	}


	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		
		PropertySourcesPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertyPlaceholderConfigurer;
		
	}

}
