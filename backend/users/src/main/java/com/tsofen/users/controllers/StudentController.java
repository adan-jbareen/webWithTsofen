package com.tsofen.users.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsofen.users.beans.Student;
import com.tsofen.users.services.StudentService;

@RestController
@RequestMapping("api/students")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("add-student")
	public HttpStatus addStudent(@RequestBody Student  student) {
		if(this.studentService.addStudent(student)==1) {
			return HttpStatus.ACCEPTED;
		}
		else {return HttpStatus.BAD_REQUEST;}
	}
	@GetMapping("get-all-student")
	public List<Student> getAll(){
		return studentService.getAllStudents();
	}

	@PutMapping("edit-student")
	public HttpStatus editStudent(@RequestBody Student student) {
		if(studentService.updateStudent(student)==1) return HttpStatus.ACCEPTED;		
		else {return HttpStatus.BAD_REQUEST;}
	}
//
//	@DeleteMapping("delete-student")
//	public void deleteStudent(@RequestBody Student student) {
//		studentService.deleteStudent(student);
//	}
//
//	@GetMapping("find-by-id")
//	public Student findById(@RequestParam String socialId){
//		return studentService.findBySocialId(socialId);
//	}

}

