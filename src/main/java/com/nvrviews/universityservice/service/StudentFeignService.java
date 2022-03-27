package com.nvrviews.universityservice.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import model.Student;

@FeignClient("STUDENT-SERVICE")
public interface StudentFeignService {
	
	@GetMapping("/student/")
	public List<Student> getStudents();

}
