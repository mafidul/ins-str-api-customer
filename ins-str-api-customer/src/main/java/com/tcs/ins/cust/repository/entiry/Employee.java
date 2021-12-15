package com.tcs.ins.cust.repository.entiry;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;

@Entity(name = "EMPLOYEE")
public class Employee {
	@Id
	@Column(name = "EMPID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long empId;
	@Column(name = "EMPNAME")
	private String empName;
	@Column(name = "ADDRESS")
	private String address;
	@Column(name = "PHONENO")
	private Long phoneNo;

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(Long phoneNo) {
		this.phoneNo = phoneNo;
	}

	@ManyToMany
	@JoinTable(name = "EMP_PRJ", joinColumns = @JoinColumn(name = "EMPLOYEEID", referencedColumnName = "EMPID"), inverseJoinColumns = @JoinColumn(name = "PROJECTID", referencedColumnName = "ID"))
	Set<Project> project;

	public Set<Project> getProject() {
		return project;
	}

	public void setProject(Set<Project> project) {
		this.project = project;
	}
}
