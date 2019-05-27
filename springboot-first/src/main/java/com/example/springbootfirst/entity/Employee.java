package com.example.springbootfirst.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Employee")
@Setter
@Getter
public class Employee {
	
	@Id
	@Column(name="employee_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long employeeId;
	
	@Column(name="employee_name")
	private String employeeName;
	
	@Column(name="designation")
	private String designation;

}
