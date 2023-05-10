package com.jetbreed.hibernate_evaluation;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Subjects")
public class Courses {
	
	@Id
	@Column(name = "ID")
	int course_id;
	
	@Column(name = "SubjectName")
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
