package ch4Factory;

import ch4Factory.ingredient.PizzaIngredientFactory;

public class BoolGogiPizza extends Pizza {
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public BoolGogiPizza(PizzaIngredientFactory pizzaIngredientFactory) {
		setName( " Korea Style Cutting Pizza");
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}

	@Override
	public void prepare() {
		System.out.println("재료준비중... " +name);
		dough = pizzaIngredientFactory.createDough();
		cheese = pizzaIngredientFactory.createCheese();
		boolgogi = pizzaIngredientFactory.createBoolgogi();
		
		System.out.println(dough.getClass().getSimpleName());
		System.out.println(cheese.getClass().getSimpleName());
		System.out.println(boolgogi.getClass().getSimpleName());
	}
}
