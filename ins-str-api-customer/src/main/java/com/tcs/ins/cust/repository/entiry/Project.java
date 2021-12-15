package com.tcs.ins.cust.repository.entiry;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity(name = "PROJECT")
public class Project {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	@Column(name = "PROJECTNAME")
	private String projectName;
	@Column(name = "PROJECTDETAILS")
	private String projectDetails;
	@Column(name = "LOCATION")
	private String location;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectDetails() {
		return projectDetails;
	}

	public void setProjectDetails(String projectDetails) {
		this.projectDetails = projectDetails;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	@ManyToMany(mappedBy = "project")
	Set<Employee> Employee;

	public Set<Employee> getEmployee() {
		return Employee;
	}

	public void setEmployee(Set<Employee> employee) {
		Employee = employee;
	}
}
