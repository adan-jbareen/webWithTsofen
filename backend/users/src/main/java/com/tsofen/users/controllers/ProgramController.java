package com.tsofen.users.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsofen.users.beans.Program;
import com.tsofen.users.services.ProgramService;

@CrossOrigin
@RestController
@RequestMapping("api/programs")
public class ProgramController {
	@Autowired
	private ProgramService programService;
	
	@PostMapping("addOrUpdateProgram")
	public void addOrUpdateProgram(@RequestBody Program program) {
		programService.addOrUpdateProgram(program);
	}
	
	@GetMapping("getPrograms")
	public List<Program> getAllPrograms(){
		return this.programService.getAllPrograms();
	}

	@GetMapping("search/byName")
	public List<Program> findByNameIgnoreCase(String name){
		return this.programService.findByNameIgnoreCase( name);
	}
	
	@GetMapping("search/byDescription")
	public List<Program> findByDescriptionIgnoreCase(String description){
		return this.programService.findByDescriptionIgnoreCase(description);
	}
	
	@GetMapping("search/byCost")
	public List<Program> findByCostBetween(int min, int max){
		return this.programService.findByCostBetween(min, max);
	}
}
