package com.springtips.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springtips.entity.Course;
import com.springtips.repository.CourseRepository;


@Service
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseRepository courseRepo;

	@Override
	public String upsert(Course course) {
		// TODO Auto-generated method stub
		courseRepo.save(course);
		return "success";
	}

	@Override
	public Course getById(Integer cid) {
		// TODO Auto-generated method stub
		Optional<Course> findById = courseRepo.findById(cid);

		if (findById.isPresent()) {
			return findById.get();
		}

		return null;

	}

	@Override
	public List<Course> getAllCourses() {
		// TODO Auto-generated method stub
		return courseRepo.findAll();
	}

	@Override
	public String deleteById(Integer cid) {
		// TODO Auto-generated method stub
		if (courseRepo.existsById(cid)) {
			courseRepo.deleteById(cid);
			return "Delete Success";
		} else {
			return "No Record Found";
		}
	}

}
