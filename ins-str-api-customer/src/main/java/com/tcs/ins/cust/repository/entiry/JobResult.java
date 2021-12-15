package com.tcs.ins.cust.repository.entiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "JOBRESULT")
public class JobResult {
	@Id
	@Column(name = "NAME")
	private String name;
	@Column(name = "VALUE")
	private String value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}