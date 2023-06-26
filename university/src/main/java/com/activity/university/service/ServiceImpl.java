package com.activity.university.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.activity.university.enitity.StudentDetails;
import com.activity.university.repository.StudentRepository;

@Service
public class ServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepository;

	@Override
	public StudentDetails getById(String id) {
		
		return studentRepository.findById(id).get();
	}

	@Override
	public List<StudentDetails> getAllStudents() {
		
		return studentRepository.findAll();
	}

	
	

}
