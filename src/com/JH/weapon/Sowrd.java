package com.JH.weapon;

public class Sowrd extends Weapon {
	private int damage;

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	@Override
	public void attack() {
		this.slash();
	}
	public void slash() {
		System.out.println("칼로베기");
	}
	
	
}
