package com.tsofen.users.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsofen.users.beans.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{
	public Student findById(int Id);
	public List<Student> findByFirstName(String firstName);
	public Student findBySocialId(String socialId);
//	public List<Student>findByAllSocialId(String socialId);

}
