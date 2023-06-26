package com.activity.university;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.activity.university.enitity.StudentDetails;
import com.activity.university.repository.StudentRepository;
import com.activity.university.service.ServiceImpl;

@SpringBootTest
class UniversityApplicationTests {

	
	@Autowired
	StudentRepository studentrepo;
	
	@Autowired
	ServiceImpl service;
	
	
	@Test
	 void getStudentTest() {
		when(studentrepo.findAll()).thenReturn(Stream.of(new StudentDetails("1","Anagha","Java","89"),
				new StudentDetails("2","Anu","Java","69"))
				.collect(Collectors.toList()));
		assertEquals(2, service.getAllStudents().size()); 

	}
	
	@Test
	 void getStudentByIdTest() {
		String id="2"; 
		service.getById(id);
	    verify(studentrepo).findById(id);

	}

}
