package com.tsofen.users.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsofen.users.beans.School;
import com.tsofen.users.services.SchoolService;

@RestController
@RequestMapping("api/schools")
public class SchoolController {
	@Autowired
	private SchoolService schoolService;
	
	@PostMapping("add-School")
	public void addSchool(@RequestBody School school) {
		schoolService.addSchool(school);
	}
	
	@GetMapping("get-All-School")
	public List<School> getAll() {
		return schoolService.getAllSchool();
	}
	
	

}
