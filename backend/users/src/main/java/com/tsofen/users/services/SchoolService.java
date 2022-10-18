package com.tsofen.users.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsofen.users.beans.School;
import com.tsofen.users.repos.SchoolRepo;

@Service
public class SchoolService {
	@Autowired
	private SchoolRepo schoolRepo;
	
	public void addSchool(School school) { 
		schoolRepo.save(school);
	}
	
	public List<School> getAllSchool() {
		return schoolRepo.findAll()	;
	}

}