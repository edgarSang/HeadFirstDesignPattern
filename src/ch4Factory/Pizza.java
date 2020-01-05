package ch4Factory;

import ch4Factory.ingredient.Boolgogi;
import ch4Factory.ingredient.Cheese;
import ch4Factory.ingredient.Dough;
import ch4Factory.ingredient.Veggies;

public abstract class Pizza {
	String name;
	Dough dough;
	Cheese cheese;
	Boolgogi boolgogi;
	Veggies veggies[];
	
	public abstract void prepare();

	public void bake() {
		System.out.println("굽는중.....");
	}
	
	public void cut() {
		System.out.println("자르는중.....");
	}
	
	public void box() {
		System.out.println("박싱중.....");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}