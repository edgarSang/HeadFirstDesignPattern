package ch4Factory;

public class KorPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza= null;
		
		if(type.equals("boolgogi")) {
	        pizza = new KorBoolGoggiPizza();
	    } 
		
		return pizza;
	}

}
