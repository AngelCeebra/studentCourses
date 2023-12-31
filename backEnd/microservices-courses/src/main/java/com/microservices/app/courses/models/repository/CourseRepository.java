package com.microservices.app.courses.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservices.app.courses.models.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long>{

}
