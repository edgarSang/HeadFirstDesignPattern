package ch3Decorator;

public class Mocha extends ToppingDecorator{
	
	Beverage beverage;
	
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", 추가 모카";
	}

	@Override
	public int cost() {
		return 500 + this.beverage.cost();
	}

}
