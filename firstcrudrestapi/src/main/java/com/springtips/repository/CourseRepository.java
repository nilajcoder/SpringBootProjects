package com.springtips.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springtips.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Serializable> {

}
