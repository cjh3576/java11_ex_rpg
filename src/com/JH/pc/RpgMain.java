package com.JH.pc;


import com.JH.weapon.Sowrd;
import com.JH.weapon.Stick;

public class RpgMain {

	public static void main(String[] args) {
		Worrier w = new Worrier();
		Magition m = new Magition();
		
		Sowrd s = new Sowrd();
		s.setName("단검");
		s.setDamage(10);
		
		Stick st = new Stick();
		st.setName("나무지팡이");
		
		
		w.setAttack(s);
		w.getAttack().attack();
		
		m.setStick(st);
		m.getStick().attack();
		
		
	}

}
