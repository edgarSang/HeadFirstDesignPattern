package ch4Factory;

public class IndiaPizzaStore extends PizzaStore {

	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza= null;
		
		if(type.equals("boolgogi")) {
	        pizza = new IndiaBoolGoggiPizza();
	    } 
		
		return pizza;
	}

}
