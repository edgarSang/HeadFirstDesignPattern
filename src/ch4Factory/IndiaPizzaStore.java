package ch4Factory;

import ch4Factory.ingredient.IndiaPizzaIngredientFactory;
import ch4Factory.ingredient.PizzaIngredientFactory;

public class IndiaPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza= null;
		PizzaIngredientFactory fac = new IndiaPizzaIngredientFactory();
		
		if(type.equals("boolgogi")) {
			pizza = new BoolGogiPizza(fac);
			pizza.setName(" India Style Pizza From KOR ingredient Factory");
	    } 
		
		return pizza;
	}

}
