package com.ob.finaltestcase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "employee_leave")
@Entity
public class EmployeeLeave {
public EmployeeLeave(String date, int employeeId) {
		super();
		this.date = date;
		this.employeeId = employeeId;
	}
@Id
	@Column(name = "leave_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int leaveId;

	@Column(name = "leave_date")
	private String date;

	@Column(name = "leave_status")
	private String leaveStatus = "Pending";

	@Column(name = "employee_id")
	private int employeeId;
	
	

	public EmployeeLeave() {
		super();
	}
	
	

	public EmployeeLeave(int leaveId, String date, String leaveStatus, int employeeId) {
		super();
		this.leaveId = leaveId;
		this.date = date;
		this.leaveStatus = leaveStatus;
		this.employeeId = employeeId;
	}



	public int getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(int leaveId) {
		this.leaveId = leaveId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLeaveStatus() {
		return leaveStatus;
	}

	public void setLeaveStatus(String leaveStatus) {
		this.leaveStatus = leaveStatus;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	
}