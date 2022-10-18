package com.tsofen.users.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "classes")
public class SchoolClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id; 
	@NotBlank(message = "Can't Enter Empty Grade!")
	private String grade;
	@NotBlank(message = "Can't Enter Empty Ordinal Number!")
	private String ordinalNumber;
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "school_id")
//	private int schoolId;
}