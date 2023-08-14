package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@RequestMapping("/courses")
	public List<Course> retriveAllCourses()
	{
		return Arrays.asList(new Course(1,"Learn AWS","in28minutse"),
				new Course(2,"Learn devopes","in28minutes"));
	}
	@RequestMapping("/users")
	public List<Users> retriveAllUsers()
	{
		return Arrays.asList(new Users(1,"Deepankar Gautam", "Software Engineer"),
				new Users(2,"Ashutosh Singh","Sales Person"));
	}
	
}
