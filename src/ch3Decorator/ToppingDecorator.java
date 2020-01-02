package ch3Decorator;

//Beverage 객체가 들어갈 자리에 있어야하므로, 베버리지 상속
public abstract class ToppingDecorator extends Beverage {
	//모든 토핑은 description을 구현하도록 만들예정임
	public abstract String getDescription();
}
