package com.tcs.ins.cust.repository.entiry;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "JOB")
public class Job {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "JOBTYPE")
	private String jobType;
	@Column(name = "ENTITY")
	private String entity;
	@Column(name = "STATUS")
	private String status;

	public String getJobType() {
		return jobType;
	}

	public void setJobType(String jobType) {
		this.jobType = jobType;
	}

	public String getEntity() {
		return entity;
	}

	public void setEntity(String entity) {
		this.entity = entity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@OneToMany
	@JoinColumn(name = "JOBPARAM_ID", referencedColumnName = "ID")
	private List<JobParam> jobParam;

	@OneToMany
	@JoinColumn(name = "JOBRESULT_ID", referencedColumnName = "ID")
	private List<JobResult> jobResult;
}
