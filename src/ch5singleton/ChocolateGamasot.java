package ch5singleton;

public class ChocolateGamasot {
	
	private static ChocolateGamasot unique;
	private boolean empty;
	private boolean heat;
	
	private ChocolateGamasot() {
		empty = true;
		heat = false;
	}
	
	public static ChocolateGamasot getInstance() {
		if(unique == null) {
			unique = new ChocolateGamasot();
		}
		return unique;
	}
	
	//가마솟이 비어있을때만 집어넣음.
	public void fill() {
		if(isEmpty()) {
			empty = false;
			heat = false;
			// 원유를 집어넣음
		}
	}
	
	public void drain() {
		if(!isEmpty() && isHeat()) {
			//끓인 재료를 다음 단계로 넘김
			empty = true;
		}
	}
	
	public void boil() {
		if(isEmpty() && isHeat()) {
			// 끓임
			heat = true;
		}
	}
	
	private boolean isHeat() {
		return heat;
	}

	public boolean isEmpty() {
		return empty;
	}
}
