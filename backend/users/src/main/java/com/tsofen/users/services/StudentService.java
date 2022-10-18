package com.tsofen.users.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.tsofen.users.beans.Student;
import com.tsofen.users.repos.StudentRepo;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;
	
	public List<Student> getAllStudents() {
		return studentRepo.findAll();
	}
	
	public int addStudent(@RequestBody Student student) {
		Student exsitingStudent=studentRepo.findBySocialId(student.getSocialId());
		if(exsitingStudent==null) {
			studentRepo.save(student);
			return 1;
		}
		else {
			return 0;
		}
		
	}

	@Transactional        
	public int updateStudent(@RequestBody Student  student) {
		Student exsitStudent = studentRepo.findById(student.getId());
		if(exsitStudent!=null) {
			exsitStudent.setFirstName(student.getFirstName());
			exsitStudent.setLastName(student.getLastName());
			exsitStudent.setSocialId(student.getSocialId());
			exsitStudent.setParent1Id(student.getParent1Id());
			exsitStudent.setParent2Id(student.getParent2Id());
			exsitStudent.setClassId(student.getClassId());
			return 1;
		}
		return 0;
	}
	
}
		
	
//	
//	public void deleteStudent(Student student) {
//		studentRepo.delete(student);
//	}
//	
//	public Student findBySocialId(String socialId) {
//		Optional<Student> student = studentRepo.findBySocialId(socialId);
//		if(!student.isPresent() || student.isEmpty())
//			throw new IllegalStateException("Student with ID: " + socialId + " Doesn't Exist!");
//		else
//			return student.get();
//	}
//}
