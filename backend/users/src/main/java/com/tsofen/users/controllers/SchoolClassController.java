package com.tsofen.users.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tsofen.users.beans.SchoolClass;
import com.tsofen.users.services.SchoolClassService;

@RestController
@RequestMapping("api/classes")
public class SchoolClassController {
	@Autowired
	private SchoolClassService schoolClassService;

	@GetMapping("getAllSchoolClasses")
	public List<SchoolClass> getAllSchoolClasses(){
		return schoolClassService.getAllSchoolClasses();
	}

	@PostMapping("addSchoolClass")
	public void addSchoolClass(@RequestBody SchoolClass schoolclass) {
		schoolClassService.addSchoolClass(schoolclass);
	}

	@PutMapping("editSchoolClass")
	public void editSchoolclass(@RequestBody SchoolClass Schoolclass) {
		schoolClassService.editSchoolClass(Schoolclass);
	}

	@DeleteMapping("deleteSchoolClass")
	public void DeleteSchoolClass(@RequestBody SchoolClass Schoolclass) {
		schoolClassService.DeleteSchoolClass(Schoolclass);
	}

	@GetMapping("SearchClassesByGrade")
	public List<SchoolClass> SearchClassesByGrade(@RequestParam String Grade){
		return schoolClassService.SearchClassbyGrade(Grade);	
	}
}