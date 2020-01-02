
package ch2Observer.weather;

import java.util.Observable;

import ch2Observer.Observer;
import ch2Observer.Subject;

public class CurrentConditions implements DisplayElements,java.util.Observer{
	
	//구지 생성자 맑도는 안쓰는데 왜 저장해야하지?, 나중에 탈퇴할때를 대비해서.
	private Observable ob;
	private float humidity;
	private float temperature;
	
	
	public CurrentConditions(Observable ob) {
		this.ob = ob;
		ob.addObserver(this);
	}
	
	
	@Override
	public void display() {
		System.out.println(String.format("Current Conditions: temp: %d humidity: %d ", temperature, humidity));
	}

	@Override
	public void update(Observable obs, Object arg) {
		
	}

}
