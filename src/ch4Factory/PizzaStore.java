package ch4Factory;

public abstract class PizzaStore {
	public Pizza orderPizza(String type) {
		Pizza pizza;

		// 바뀐부분
		pizza = createPizza(type);

		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}

	//
	protected abstract Pizza createPizza(String type);
}