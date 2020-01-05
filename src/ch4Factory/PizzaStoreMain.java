package ch4Factory;

public class PizzaStoreMain {

	public static void main(String[] args) {
		PizzaStore korStore = new KorPizzaStore();
		PizzaStore indiaStore = new IndiaPizzaStore();
		
		Pizza pizza = korStore.orderPizza("boolgogi");
		System.out.println("완성" + pizza.getName() + "\n");
		
		pizza = indiaStore.orderPizza("boolgogi");
		System.out.println("완성" + pizza.getName() + "\n");
	}
}
