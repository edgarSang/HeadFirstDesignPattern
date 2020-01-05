package ch4Factory.ingredient;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Cheese createCheese();
	public Boolgogi createBoolgogi();
	//이건 지역별로 함께 쓸 수 있다.
	public Veggies[] createVeggies();
}
