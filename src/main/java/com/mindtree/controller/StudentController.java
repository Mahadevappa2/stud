package com.mindtree.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.mindtree.entity.Student;
import com.mindtree.service.StudentService;

@Controller
public class StudentController {
	
	private StudentService service;

	public StudentController(StudentService service) {
		super();
		this.service = service;
	}
	
	@GetMapping("/students")
	public String listStudent(Model model)
	{
		model.addAttribute("students",service.getAllStudent());
		
		return "students";
		
	}
	
	@GetMapping("/students/new")
	public String createStudentsForm(Model model)
	{
		Student student=new Student();
		model.addAttribute("student", student);
		return"create_student";
	}
	
	@PostMapping("/students")
	public String saveStudent(@ModelAttribute("student") Student student)
	{
		
		service.saveStudent(student);
		return "redirect:/students";
		
	}
	@GetMapping("/students/edit/{id}")
	public String editStudentForm(@PathVariable Long id,Model model)
	{
		model.addAttribute("student",service.getStudentById(id));
		return "edit_student";
		
	}
	
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model)
	{
		Student esxistingStudent=service.getStudentById(id);
		esxistingStudent.setId(id);
		esxistingStudent.setFirstName(student.getFirstName());
		esxistingStudent.setLastName(student.getLastName());
		esxistingStudent.setEmail(student.getEmail());
		service.updateStudent(esxistingStudent);
		return "redirect:/students";
		
	}
	
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id)
	{
		service.deleteById(id);
		return "redirect:/students";
		
	}
	
	
	
	

}
