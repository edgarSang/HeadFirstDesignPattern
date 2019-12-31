package ch2Observer.weather;

import ch2Observer.Observer;
import ch2Observer.Subject;

public class WeatherData implements Subject{

	@Override
	public void notifyObserver() {
		
	}
	
	void getTemp() {
		
	}
	
	void getHumidity() {
		
	}
	
	void getPressure () {
		
	}

	void measurementsChanged() {
		
	}

	@Override
	public void registerObserver(Observer o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeObserver(Observer o) {
		// TODO Auto-generated method stub
		
	}
}
