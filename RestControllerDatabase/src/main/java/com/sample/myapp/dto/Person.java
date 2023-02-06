package com.sample.myapp.dto;

public class Person {
	private Integer id;
	private String name;
	private String job;
	
	public Person() { super(); }
	
	// 각 변수에 대한 getter, setter 
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getJob() {
		return this.job;
	}
	public void setJob(String job) {
		this.job = job;
	}	
	
}
