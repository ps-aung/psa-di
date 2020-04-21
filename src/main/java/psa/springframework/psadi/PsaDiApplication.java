package psa.springframework.psadi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import psa.springframework.examplebeans.FakeDataSource;
import psa.springframework.examplebeans.FakeOther;
import psa.springframework.psadi.controllers.ConstructorInjectedController;
import psa.springframework.psadi.controllers.I18nController;
import psa.springframework.psadi.controllers.MyController;
import psa.springframework.psadi.controllers.PropertyInjectedController;
import psa.springframework.psadi.controllers.SetterInjectedController;

@SpringBootApplication
@ComponentScan(basePackages = {"psa.springframework.services","psa.springframework"})
public class PsaDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(PsaDiApplication.class, args);
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		
		System.out.println(i18nController.sayHello());
		
		MyController myController = (MyController) ctx.getBean("myController");
		
		System.out.println("............. PRIMARY Bean");
		
		System.out.println(myController.sayHello());
		
		System.out.println("............. property");
		
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("............. Setter");
		
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("............. Constructor");
		
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		
		System.out.println(constructorInjectedController.getGreeting());
		
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		
		System.out.println(fakeDataSource);
		
		FakeOther fakeOther = ctx.getBean(FakeOther.class);
		
		System.out.println(fakeOther);
	}

}
