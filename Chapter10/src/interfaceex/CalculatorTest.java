package interfaceex;

public class CalculatorTest {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc();		/*CompleteCalc가 Calc에 대한 정보를 내포하고 있어야 사용 가능. Calc라는 타입을 가지고 있는 것 = 타입상
	인터페이스를 기반으로 구현된 인스턴스 클래스를 가져다 쓰는 것을 클라이언트 코드라고 한다.
		웹페이지에서 웹서버의 컴포넌트들을 가져다 쓰는. 프론트엔드 코드를 클라이언트 코드라고 할 수 있다.*/
		System.out.println(calc.add(num1, num2));
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);		//정적 메소드 : 인스턴스 이름만을 호출해서 사용할 수 있음 
		System.out.println(sum);
	}

}
