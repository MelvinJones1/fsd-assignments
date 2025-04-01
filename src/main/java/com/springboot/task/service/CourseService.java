package com.springboot.task.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.task.exception.InvalidIdException;
import com.springboot.task.model.Course;
import com.springboot.task.repository.CustomerRepository;

@Service
public class CourseService {


	@Autowired
	private CustomerRepository courseRepository;


  
	
	
	
	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return courseRepository.save(course);
	}






	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		List<Course> list = courseRepository.findAll();
		return 	list;
	
	
}






	public Course getById(int id) throws InvalidIdException {
		// TODO Auto-generated method stub
		Optional<Course> optional =  courseRepository.findById(id);
 		if(optional.isEmpty())
 			throw new InvalidIdException("ID given is Invalid...");
 		
 		return optional.get();
	}
	
}
