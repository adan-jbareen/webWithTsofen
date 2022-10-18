package com.tsofen.users.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tsofen.users.beans.SchoolClass;

@Repository
public interface SchoolClassRepo extends JpaRepository<SchoolClass, Integer> {
	//public Optional<SchoolClass> findById(int Id); - already exists by default
	public List<SchoolClass> findAllByGradeIgnoreCase(String Grade);
	public Optional<SchoolClass> findByGradeAndOrdinalNumber(String Grade,String OrdinalNumber);
}
