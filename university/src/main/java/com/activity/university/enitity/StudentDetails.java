package com.activity.university.enitity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Details" )
public class StudentDetails 
{
	@Id
	private String id;
	private String studentName;
	private String subject;
	private String score;
	
	
	public StudentDetails(String id, String studentName, String subject, String score) {
		super();
		this.id = id;
		this.studentName = studentName;
		this.subject = subject;
		this.score = score;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getScore() {
		return score;
	}


	public void setScore(String score) {
		this.score = score;
	}


	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", studentName=" + studentName + ", subject=" + subject + ", score=" + score
				+ "]";
	}
	
	
	

}
