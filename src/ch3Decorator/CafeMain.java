package ch3Decorator;

public class CafeMain {

	public static void main(String[] args) {
		Beverage beverage = new DarkRoast();
		
		System.out.println(beverage.getDescription() + " 가격은: " + beverage.cost());
		
		//모카 추가
		beverage = new Mocha(beverage);
		System.out.println(beverage.getDescription() + " 가격은: " + beverage.cost());
		
		//휘핑 추가
		beverage = new Whip(beverage);
		System.out.println(beverage.getDescription()  + " 가격은: " + beverage.cost());
		
	}

}
