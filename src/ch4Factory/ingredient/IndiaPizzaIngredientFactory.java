package ch4Factory.ingredient;

public class IndiaPizzaIngredientFactory implements PizzaIngredientFactory{

	@Override
	public Dough createDough() {
		return new VeggieDough();
	}

	@Override
	public Cheese createCheese() {
		return new VeggieCheese();
	}

	@Override
	public Boolgogi createBoolgogi() {
		return new ChickenBoolgogi();
	}

	@Override
	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom()};
		return veggies;
	}
}
