package com.ob.finaltestcase;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Entity
@Table(name = "employee_info")
public class Employee {

	public Employee(String employeeName, String employeeType, String email, String password) {
		super();
		this.employeeName = employeeName;
		this.employeeType = employeeType;
		this.email = email;
		this.password = password;
	}

	@Id
	@Column(name = "employee_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;

	@Column(name = "employee_name")
	private String employeeName;

	@Column(name = "employee_type")
	private String employeeType;

	@Column(name = "email_id")
	private String email;

	@Column(name = "password")
	private String password;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, String employeeType, String email, String password) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeType = employeeType;
		this.email = email;
		this.password = password;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeType() {
		return employeeType;
	}

	public void setEmployeeType(String employeeType) {
		this.employeeType = employeeType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
