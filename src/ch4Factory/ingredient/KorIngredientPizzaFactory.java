package ch4Factory.ingredient;

public class KorIngredientPizzaFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new OriginalDough();
	}

	@Override
	public Cheese createCheese() {
		return new OriginalCheese();
	}

	@Override
	public Boolgogi createBoolgogi() {
		return new BeefBoolgogi();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom()};
		return veggies;
	}

}
