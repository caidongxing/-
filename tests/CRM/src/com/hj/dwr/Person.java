package com.hj.dwr;

public class Person {

	private String name;
	private int ages;
	private boolean sex;
	
	
	
	
	public Person(String name, int ages, boolean sex) {
		super();
		this.name = name;
		this.ages = ages;
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAges() {
		return ages;
	}
	public void setAges(int ages) {
		this.ages = ages;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	
}
