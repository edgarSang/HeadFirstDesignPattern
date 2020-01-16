package ch7adapter.chracter;

import ch7adapter.AttackBehavior;

public abstract class Person {
	AttackBehavior attackBehav;
	protected String className = "no";
	
	public void performAttack() throws Exception {
		attackBehav.attack(this.className);
	}
}
