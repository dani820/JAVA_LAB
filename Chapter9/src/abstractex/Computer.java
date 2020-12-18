package abstractex;

public abstract class Computer {

	public abstract void display();		// 추상 메소드. 메소드 구현 안 하고 선언만 하겠다. 구현할 경우 {바디} 라고 하는 것을 기재. 코드 없어도 중괄호만 있으면 구현을 한 것이라고 함. 메소드 이름, 매개변수, 반환값 알 수 있다. 하위클래스에 위임해야 되는 부분 구현.
	public abstract void typing();			//상위 클래스 : 어떻게 보여줄 것인가에 대한 구현. 하위 클래스 : 무엇을 보여줄 것인가에 대한 구현.
	
	
	
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
/*추상 클래스는 상속을 하기 위해 만드는 클래스. 혼자 돌아가는 클래스가 아님. new X. 인스턴스화 될 수 없다.
선언된 추상 클래스 바탕으로 하위 클래스가 이 클래스에 기반한 클래스를 구현
추상 클래스에서 추상 메소드를 선언하는 메소드는 하위 클래스가 각자 구현해야되는 메소드. 구현하는 메소드는 공통적으로 쓰는 메소드  */