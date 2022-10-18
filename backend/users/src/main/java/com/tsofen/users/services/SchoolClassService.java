package com.tsofen.users.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tsofen.users.beans.SchoolClass;
import com.tsofen.users.repos.SchoolClassRepo;

@Service
public class SchoolClassService {
	@Autowired
	private SchoolClassRepo schoolClassRepo;

	public List<SchoolClass> getAllSchoolClasses(){
		return schoolClassRepo.findAll();
	}

	public void addSchoolClass(SchoolClass schoolclass) {
		Optional<SchoolClass> exists = 
				schoolClassRepo.findByGradeAndOrdinalNumber(schoolclass.getGrade(), schoolclass.getOrdinalNumber());
		if(exists.isPresent() && !exists.isEmpty())
			throw new IllegalStateException("School class " + exists.get().getGrade()+" " +exists.get().getOrdinalNumber()+" Already Exists!");
		else
			schoolClassRepo.save(schoolclass);
	}

	public void editSchoolClass(SchoolClass schoolclass) {
		schoolClassRepo.save(schoolclass);
	}

	public void DeleteSchoolClass(SchoolClass schoolclass) {
		schoolClassRepo.delete(schoolclass);
	}

	public List<SchoolClass> SearchClassbyGrade(String grade) {
		return schoolClassRepo.findAllByGradeIgnoreCase(grade);
	}
}
