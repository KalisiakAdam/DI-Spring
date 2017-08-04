package com.winwinteam;

import com.winwinteam.controllers.ConstructorInjectedController;
import com.winwinteam.controllers.FirstController;
import com.winwinteam.controllers.PropertyInjectedController;
import com.winwinteam.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.prefs.PreferenceChangeEvent;

@SpringBootApplication
public class DependancyInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DependancyInjectionApplication.class, args);

		FirstController controller = (FirstController) ctx.getBean("firstController");

		controller.hello();

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
