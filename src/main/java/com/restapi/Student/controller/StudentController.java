package com.restapi.Student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.Student.entity.Student;
import com.restapi.Student.service.StudentServices;

@RestController
public class StudentController {
	@Autowired
	private StudentServices service;

	@PostMapping("/add")
	public Student addStudent(@RequestBody Student s) {

		return service.addStudent(s);

	}

	@GetMapping("/get")
	public List<Student> getAllStudents() {

		return service.getAllStudents();

	}

	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student s) {

		return service.updateStudent(s);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteStudent(@PathVariable int id) {
		service.deleteStudent(id);
	}

}
