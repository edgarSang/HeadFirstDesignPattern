package ch4Factory;

public class DependentPizzaStore {
	public Pizza createPizza(String nation, String type) {
		
		Pizza pizza = null;
		if (nation.equals("kor")) {
			if(type.equals("bollgogi")) {
				pizza = new KorBoolGoggiPizza();
			} else if (type.equals("cheese")) {
//				pizza = new KorCheesePizza();
			} else if (type.equals("veggie")) {
//				pizza = new KorVeggiePizza();
			}
		} else if (nation.equals("india")) {
			if(type.equals("bollgogi")) {
				pizza = new IndiaBoolGoggiPizza();
			} else if (type.equals("cheese")) {
//				pizza = new IndiaCheesePizza();
			} else if (type.equals("veggie")) {
//				pizza = new IndiaVeggiePizza();
			}
		}
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();

		return pizza;
	}
}
