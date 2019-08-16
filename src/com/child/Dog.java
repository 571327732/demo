package com.child;




public class Dog extends Pet {

	private String strain;

	public Dog(){
		System.out.println("子类无参");
	}

	public Dog(String name, int health, int love,String strain) {
		super(name, health, love);
		this.strain=strain;
		System.out.println("子类带参 ");
	}
	
	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	

	public  String print(){
	   return "我的姓名为"+name+",健康值"+health+",亲密度"+love+"品种为"+this.getStrain();
	}

	
	
	
}
