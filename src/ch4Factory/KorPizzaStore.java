package ch4Factory;

import ch4Factory.ingredient.KorIngredientPizzaFactory;
import ch4Factory.ingredient.PizzaIngredientFactory;

public class KorPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza= null;
		PizzaIngredientFactory fac = new KorIngredientPizzaFactory();
		
		if(type.equals("boolgogi")) {
			pizza = new BoolGogiPizza(fac);
			pizza.setName("Korea Style Pizza From KOR ingredient Factory");
	    } 
		
		return pizza;
	}

}
