package com.restapi.Student.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restapi.Student.entity.Student;

@Service
public interface StudentServices {

	Student addStudent(Student s);

	List<Student> getAllStudents();

	Student updateStudent(Student s);

	void deleteStudent(int id);

}