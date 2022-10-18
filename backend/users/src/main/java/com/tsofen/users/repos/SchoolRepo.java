package com.tsofen.users.repos;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsofen.users.beans.School;

@Repository
public interface SchoolRepo extends JpaRepository<School, Integer>{
	public Optional<School>  findByName(String name);
	public Optional<School>  findById(int schoolId);
	//public Optional<School>  findByManagerId(String managerId);
}
