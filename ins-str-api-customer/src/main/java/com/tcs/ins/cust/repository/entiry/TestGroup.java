package com.tcs.ins.cust.repository.entiry;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity(name = "TESTGROUP")
public class TestGroup {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "NAME")
	private String nmae;
	@Column(name = "DESCRIPTION")
	private String desc;
	@Column(name = "CLIENTID")
	private Long clientId;
	@Column(name = "ENVCODE")
	private String envCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNmae() {
		return nmae;
	}

	public void setNmae(String nmae) {
		this.nmae = nmae;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Long getClientId() {
		return clientId;
	}

	public void setClientId(Long clientId) {
		this.clientId = clientId;
	}

	public String getEnvCode() {
		return envCode;
	}

	public void setEnvCode(String envCode) {
		this.envCode = envCode;
	}

	@ManyToMany
	@JoinTable(name = "TESTGRP_TESTCASE", joinColumns = @JoinColumn(name = "TESTGROUP_ID", referencedColumnName = "ID"), inverseJoinColumns = @JoinColumn(name = "TESTCASE_ID", referencedColumnName = "ID"))
	Set<TestCase> testCase;

	public Set<TestCase> getTestCase() {
		return testCase;
	}

	public void setTestCase(Set<TestCase> testCase) {
		this.testCase = testCase;
	}
}
