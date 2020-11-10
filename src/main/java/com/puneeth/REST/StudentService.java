package com.puneeth.REST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentrepo;
	public List<Student> getAllStudents()
	{
		List<Student> students = new ArrayList<>();
		studentrepo.findAll().forEach(students::add);
		return students;
	}
	
	public Student getStudent(int id)
	{
		return studentrepo.findById(id).orElse(null);
	}

	public void addStudent(Student student) {
		studentrepo.save(student);
	}

	public void updateStudent(int id, Student student) {
		studentrepo.save(student);
	}

	public void deleteStudent(int id) {
		studentrepo.deleteById(id);
	}
	
}
