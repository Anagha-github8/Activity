package com.activity.university.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.activity.university.enitity.StudentDetails;

@Repository
public interface StudentRepository extends MongoRepository<StudentDetails, String> {

	
}
