package ch3Decorator;

public class Whip extends ToppingDecorator{

	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription()  + ", 추가 휘핑";
	}

	@Override
	public int cost() {
		return 500 + beverage.cost();
	}

}
