package ch4Factory;

import java.util.ArrayList;

public class IndiaBoolGoggiPizza extends Pizza {
	
	public IndiaBoolGoggiPizza() {
		setName("India Style No cutting Pizza");
		ArrayList<String> arr = new ArrayList<String>();
	}
	
	@Override
	public void cut() {
		System.out.println("인도에서는 피자를 컷팅하지 않아요");
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		
	}
}
