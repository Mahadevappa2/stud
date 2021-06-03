package com.mindtree.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.mindtree.entity.Student;
import com.mindtree.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {

	private StudentRepository sr;
	
	public StudentServiceImp(StudentRepository sr) {
		super();
		this.sr = sr;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return sr.save(student);
	}

	@Override
	public Student getStudentById(Long id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return sr.save(student);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
		
	}

}
