package com.puneeth.REST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	
	@RequestMapping("/students/{id}")
	public Student getStudent(@PathVariable int id)
	{
		return studentService.getStudent(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/students")
	public void addStudent(@RequestBody Student student)
	{
		studentService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/students/{id}")
	public void addStudent(@PathVariable int id, @RequestBody Student student)
	{
		studentService.updateStudent(id,student);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/students/{id}")
	public void addStudent(@PathVariable int id)
	{
		studentService.deleteStudent(id);
	}
}
