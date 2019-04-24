package com.JH.weapon;

public class Stick extends Weapon {
	
	
	public void spell() {
		System.out.println("주문을 외워서 공격");
	}
	
	@Override
	public void attack() {
		this.spell();
	}

	

	
	
}
