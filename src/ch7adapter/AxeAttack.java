package ch7adapter;

import java.util.Arrays;

public class AxeAttack implements AttackBehavior{
	String[] available = {"knight","mknight"};
	
	@Override
	public void attack(String className) throws Exception {
		if(Arrays.stream(available).anyMatch(className::equals)) {
			System.out.println("도끼 공격이다!!!");
		} else {
			throw new Exception("your name is " + className);
		}
	}
}
