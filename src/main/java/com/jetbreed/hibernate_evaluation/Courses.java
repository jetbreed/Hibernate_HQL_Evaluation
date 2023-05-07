package com.jetbreed.hibernate_evaluation;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Courses {
	
	@Id
	int course_id;
	
	String courseName;
	
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	
}
