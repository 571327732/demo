package com.child;




public class Dog extends Pet {

	private String strain;

	public Dog(){
		System.out.println("�����޲�");
	}

	public Dog(String name, int health, int love,String strain) {
		super(name, health, love);
		this.strain=strain;
		System.out.println("������� ");
	}
	
	public String getStrain() {
		return strain;
	}

	public void setStrain(String strain) {
		this.strain = strain;
	}
	

	public  String print(){
	   return "�ҵ�����Ϊ"+name+",����ֵ"+health+",���ܶ�"+love+"Ʒ��Ϊ"+this.getStrain();
	}

	
	
	
}
