package com.mindtree.service;

import java.util.List;

import com.mindtree.entity.Student;

public interface StudentService {

	List<Student> getAllStudent();
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	
	public void deleteById(Long id);
}
