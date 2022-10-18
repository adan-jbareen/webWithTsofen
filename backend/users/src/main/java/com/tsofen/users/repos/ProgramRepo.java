package com.tsofen.users.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsofen.users.beans.Program;

@Repository
public interface ProgramRepo extends JpaRepository<Program, Integer>{
	public List<Program> findByNameIgnoreCase(String name);
	public List<Program> findByDescriptionIgnoreCase(String description); // Isn't Needed!... Maybe Category?
	public List<Program> findByCostBetween(int min, int max);
}
