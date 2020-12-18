package interfaceex;

public interface Calc {		//인터페이스는 상수와 추상 메소드가 선언된다.
	
	double PI = 3.14;				//상수로 선언된다. (public static final) 멤버변수는, 클래스가 인스턴스로 생성될 때 힙에 메모리가 잡히는 것.
	int ERROR = -9999999;
	
	int add(int num1, int num2);			
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);			//>> interface 안에 선언되면 모두 public abstract. 추상 메소드.

	default void description() {		//기본적인 구현 코드가 제공됨 new CompleteCalc
		System.out.println("정수 계산기를 구현합니다.");
	}
	
	static int total(int[] arr) //static 키워드를 가졌을 때 인스턴스 생성 상관 없이 사용할 수 있다.
		int total = 0;
		
		for(int i : arr) {
			total += i;
		}
		return total;
	}
}
