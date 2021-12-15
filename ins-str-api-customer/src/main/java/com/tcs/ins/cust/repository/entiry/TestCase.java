package com.tcs.ins.cust.repository.entiry;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "TESTCASE")
public class TestCase {
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "NAME")
	private String nmae;
	@Column(name = "DESCRIPTION")
	private String desc;
	@Column(name = "CATEGORY")
	private Long category;
	@Column(name = "SUBCATEGORY")
	private String subCategory;

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

	public Long getCategory() {
		return category;
	}

	public void setCategory(Long category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}
}
