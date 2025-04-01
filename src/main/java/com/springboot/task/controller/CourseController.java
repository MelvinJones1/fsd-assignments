package com.springboot.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.task.dto.MessageDto;
import com.springboot.task.exception.InvalidIdException;
import com.springboot.task.model.Course;
import com.springboot.task.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/api/course/add")
	public Course addCourse(@RequestBody Course course) {
		return courseService.addCourse(course);
	}
	
	@GetMapping("api/course/getall")
	public List<Course> getAllCourse() {
		return courseService.getAllCourse();
	}
	
	@GetMapping("/api/course/one/{id}")
	public ResponseEntity<?> getById(@PathVariable int id, MessageDto messageDto) {
		
		try {
			Course course = courseService.getById(id);
			return ResponseEntity.ok(course);
		} catch (InvalidIdException e) {
			// TODO Auto-generated catch block
			messageDto.setBody(e.getMessage());
			messageDto.setStatusCode(400);
			return ResponseEntity.status(400).body(messageDto);
		}
		
			
	}
	
	

}
