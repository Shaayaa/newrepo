package com.main.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class EmployeeEntity {
	
	int employeeId;
	String employeeName;	
	String emailId;
	String password;	
	int salary;
	
	
	
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(String employeeName, String emailId, String password,int salary) {
		super();
	
		this.employeeName = employeeName;
		this.emailId = emailId;
		this.password = password;
		this.salary = salary;
	}
	
	
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	@Id
	@GeneratedValue	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emailId=" + emailId
				+ ", password=" + password + ", salary=" + salary + "]";
	}
	

}
