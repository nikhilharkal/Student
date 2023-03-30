package com.restapi.Student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restapi.Student.dao.StudentDao;
import com.restapi.Student.entity.Student;

@Service
public class StudnetServiceImpl implements StudentServices {

	@Autowired
	private StudentDao studentDao;

	@Override
	public Student addStudent(Student s) {

		return studentDao.save(s);
	}

	@Override
	public List<Student> getAllStudents() {

		return studentDao.findAll();
	}

	@Override
	public Student updateStudent(Student s) {

		return studentDao.save(s);
	}

	@Override
	public void deleteStudent(int id) {
		studentDao.deleteById(id);

	}

}
