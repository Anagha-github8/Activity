package com.activity.university.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.activity.university.enitity.StudentDetails;

@Service
@Component
public interface StudentService 
{
	public List<StudentDetails> getAllStudents();
	public StudentDetails getById(String id);
	

}
