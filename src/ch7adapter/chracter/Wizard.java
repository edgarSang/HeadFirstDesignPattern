package ch7adapter.chracter;

import ch7adapter.AttackBehavior;

public class Wizard extends Person{

	public Wizard(AttackBehavior attack) {
		this.className = "wizard";
		this.attackBehav = attack;
	}
}
