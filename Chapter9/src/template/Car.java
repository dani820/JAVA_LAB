package template;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	
	public abstract void wiper();		//추상메소드 추가 시, 하위클래스에서는 이를 구현할 의무가 있다.
	
	public void washCar() {}		//구현은 했음. 코드만 없을 뿐.  하위클래스에서 구현할 의무 없다.
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public final void run() {			//템플릿 메소드 : 하위클래스에서 재정의 할 수 없다. 바뀌면 안되는 시나리오 메소드. public 앞에 final 써도 상관없음.  
		startCar();
		drive();
		wiper();
		stop();
		washCar();			//하위클래스에서 필요에 의해 재정의 하게 되면 추가가 된다.
		turnOff();
	}
}
