package com.child;
/**
 * ����
 * @author admin
 */
public abstract class Pet {
	protected String name;
	protected int health;
	protected int love;
	
	public Pet(){
		System.out.println("�����޲�");
	}

	public Pet(String name, int health, int love) {
		this.name = name;
		this.health = health;
		this.love = love;
		System.out.println("�������");
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public int getLove() {
		return love;
	}
	public void setLove(int love) {
		this.love = love;
	}
	/**
	 * ���ҽ��ܷ���
	 */
	protected abstract  String print();

	
}
