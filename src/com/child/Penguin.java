package com.child;


public class Penguin extends Pet {

	private String sex;

	public Penguin() {
		
	}
	public Penguin(String name, int health, int love,String sex) {
		super(name, health, love);
		this.sex=sex;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	@Override
	protected String print() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
