package com.mindtree;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mindtree.entity.Student;
import com.mindtree.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementAppApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementAppApplication.class, args);
	}

	@Autowired
	private  StudentRepository ss;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*Student std=new Student("mahadeva","aland","mahadevaland@gmail.com");
		ss.save(std);
		Student std1=new Student("soma","aland","Soma@gmail.com");
		ss.save(std1);
		Student std2=new Student("vaidya","telkar","goudappa@gmail.com");
		ss.save(std2); */
	}

}
