package ch4Factory;

import java.util.ArrayList;

public abstract class Pizza {
	String name;
	ArrayList<String> toppings;
	
	public void prepare() {
		System.out.println("준비중 " + getName());
		for (int i = 0; i < toppings.size(); i++) {
			System.out.println("토핑추가 : "+ toppings.get(i));
		}
	}

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