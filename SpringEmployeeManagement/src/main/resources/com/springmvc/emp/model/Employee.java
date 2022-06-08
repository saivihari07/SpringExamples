package com.springmvc.emp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="empid")
	private int empid;
	@Column(name="empname")
	private String empname;
	@Column(name="empsalary")
	private long salary;
	@Column(name="empage")
	private int age;
	@Column(name="empaddress")
	private String Address;
	
	
	
}
