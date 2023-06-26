package com.activity.university.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.activity.university.enitity.StudentDetails;
import com.activity.university.service.ServiceImpl;

@RestController
@RequestMapping("/student")
public class Controller {
	
	@Autowired
	ServiceImpl serviceImpl;
	
	@GetMapping("/getstudent")
	public List<StudentDetails> getAllStudents() 
	{
		return serviceImpl.getAllStudents();
	}
	
	@GetMapping("/getbyid/{id}")
	public StudentDetails getStudentById(@PathVariable String id)
	{
		
		return serviceImpl.getById(id);
	}
	
	

}
