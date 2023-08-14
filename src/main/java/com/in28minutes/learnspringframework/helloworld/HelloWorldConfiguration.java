package com.in28minutes.learnspringframework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name,int age, Address adress)
{

};
record Address(String firstLine, String city)
{
	
};

@Configuration
public class HelloWorldConfiguration {
    @Bean
	public String name() {
		return "Ranga";
	}
    @Bean
	public int age() {
		return 15;
	}
    @Bean
    @Primary
    public Person person()
    {
    	return new Person("Ravi",20,new Address("Main Street","Utrecht"));
    	
    }
    
    public Person addressTOMthodCall()
    {
    	return new Person(name(),age(),address());
    	
    }
    @Bean
    public Person person3Parameters(String name,int age, Address address2)
    {
    	return new Person(name(),age(),address2);
    	
    }
    
    public Person person4Parameters(String name,int age, Address address)
    {
    	return new Person(name(),age(),address);
    	
    }
    
    @Bean(name = "address2")
    @Primary
    public Address address()
    {
    	return new Address("Baker Street","London");
    	
    }
    
    @Bean(name = "address3")
    public Address address3()
    {
    	return new Address("Laxmi nagar","Delhi");
    	
    }
	
}
