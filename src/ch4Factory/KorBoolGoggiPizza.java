package ch4Factory;

import java.util.ArrayList;

public class KorBoolGoggiPizza extends Pizza {
	public KorBoolGoggiPizza() {
		setName( "Korea Style Cutting Pizza");
		ArrayList<String> arr = new ArrayList<String>();
		this.toppings = arr;
	}
}
