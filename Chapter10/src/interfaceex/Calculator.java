package interfaceex;

public abstract class Calculator implements Calc{			//타입 상속 (interface implements). implements 는 구현 코드가 없는 여러개의 클래스가 올 수 있다.(쉼표 구분) 타입 상속만 받는 것이므로. 구현은 상속 받는 클래스에서gogo

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}

}
