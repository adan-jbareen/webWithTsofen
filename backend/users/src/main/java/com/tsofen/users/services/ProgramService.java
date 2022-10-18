package com.tsofen.users.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsofen.users.beans.Program;
import com.tsofen.users.repos.ProgramRepo;

@Service
public class ProgramService {
	@Autowired
	private ProgramRepo programsRepo;
	
	public void addOrUpdateProgram(Program program) {
		programsRepo.save(program);
	}
	
	public List<Program> getAllPrograms()
	{
		return this.programsRepo.findAll();
	}
	
	public List<Program> findByNameIgnoreCase(String name){
		return this.programsRepo.findByNameIgnoreCase(name);
	}
	public List<Program> findByDescriptionIgnoreCase(String description){
		return this.programsRepo.findByDescriptionIgnoreCase(description);
	}
	
	public List<Program> findByCostBetween(int min, int max){
		return this.programsRepo.findByCostBetween(min, max);
	}
}
