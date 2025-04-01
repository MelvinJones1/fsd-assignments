package com.springboot.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.task.model.Course;

public interface CustomerRepository extends JpaRepository<Course, Integer> {

}
