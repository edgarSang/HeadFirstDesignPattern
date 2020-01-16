package ch7adapter;

import ch7adapter.chracter.Person;
import ch7adapter.chracter.Wizard;

public class adapterMain {
	
	public static void main(String[] args) throws Exception {
		
		AttackBehavior attack = new AxeAttack();
		
		Person magicKnight = new Wizard(attack);
		
		magicKnight.performAttack();
	}
	
}
