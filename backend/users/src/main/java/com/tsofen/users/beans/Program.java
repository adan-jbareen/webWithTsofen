package com.tsofen.users.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name ="programs")
public class Program {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank(message = "Can't Enter Empty Program Name!")
	private String name;
	@NotBlank
	@Min(value = 0)
	private int cost;
	@NotBlank(message = "Can't Enter Empty Description!")
	private String description;
	@NotBlank(message= "Manager Id Can't be empty")
	private String managerId;
}

