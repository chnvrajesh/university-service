package com.nvrviews.universityservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nvrviews.universityservice.service.StudentFeignService;

import lombok.extern.slf4j.Slf4j;
import model.Student;

@RestController
@RequestMapping("/university")
@Slf4j
public class UniversityController {
	
	@Autowired
	StudentFeignService stuentService;
	
	@GetMapping("/")
	public List<Student> getAllStudents(){
		log.info("in university controller");
		List<Student> students = stuentService.getStudents();
		return students;
	}

}
