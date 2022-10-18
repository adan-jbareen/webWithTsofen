package com.tsofen.users.beans;

import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
//import lombok.Data;
import lombok.Getter;
import lombok.Setter;




@Data
@Getter
@Setter
@Entity
@Table(name="students")
public class Student {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_name") 
	@NotBlank(message = "Can't Enter Empty First Name!")
	private String firstName;
	@Column(name = "last_name")
	@NotBlank(message = "Can't Enter Empty Family Name!")
	private String lastName;
	@Size(min = 9, max = 9)
	@NotBlank(message = "Can't Enter Empty Social ID Number!")
	private String socialId;
	@Size(min = 9, max = 9)
	@NotBlank(message = "Can't Enter Empty Social ID Number!")
	private String parent1Id;
	@Size(min = 9, max = 9)
	private String parent2Id;
	@NotNull(message = "Can't Enter Empty Class ID Number!")
	private int classId;
	
	
	
}