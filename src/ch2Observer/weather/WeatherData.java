package ch2Observer.weather;

import java.util.ArrayList;
import java.util.Random;

import ch2Observer.Observer;
import ch2Observer.Subject;

public class WeatherData implements Subject{
	
	private ArrayList<Observer> observers;
	private float humidity;
	private float temperature;
	private float pressure;
	private Random random;
	
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void notifyObserver() {
		observers.stream().map(o -> o.update(temperature, humidity, pressure));
	}
	
	float getTemp() {
		return random.nextFloat();
	}
	
	float getHumidity() {
		return random.nextFloat();
	}
	
	float getPressure () {
		return random.nextFloat();
	}

	//가상 스테이션에서 갱신된 측정치를 받으면 옵저버들한테 알립니다.(왜 직접 notiy를 호출함안되지?)
	void measurementsChanged() {
		notifyObserver();
	}
	
	public void setMesuremetns() {
		this.humidity = getHumidity();
		this.pressure = getPressure();
		this.temperature = getTemp();
		measurementsChanged();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if(i > -1) {
			observers.remove(i);
		}
	}
}
