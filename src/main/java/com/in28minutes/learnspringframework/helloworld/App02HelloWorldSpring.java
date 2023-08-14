package com.in28minutes.learnspringframework.helloworld;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PackManGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App02HelloWorldSpring {

	public static void main(String[] args) {
		// 1. Launch a Spring Context

		try (var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)) {
			// System.out.println(context.getBean("name"));
			// System.out.println(context.getBean("age"));
			// System.out.println(context.getBean("person"));
			// System.out.println(context.getBean("address2"));
			// System.out.println(context.getBean("person3Parameters"));
			// System.out.println(context.getBean("address3"));
			// System.out.println(context.getBean(Address.class)); causes no qualifying bean
			// of types found
			// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);;
			System.out.println(context.getBean(Person.class));
			System.out.println(context.getBean(Address.class));
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// 2.Configure the things that we want spring to manage @Configuration class
		// HelloWorlCOnfiguration - @Configuraiton
		// name - @Bean

	}

}
