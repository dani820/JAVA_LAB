package array;

public class ArrayTest {

	public static void main(String[] args) {

		int[] numbers = new int[]{1, 2, 3}; 
		
		/*
		 int[] numbers;
		 
		 numbers = new int[]{1, 2, 3}; 	//변수 먼저 선언한 후에 뉴 생성 없이 배열만 쓸 는 없다.
		 int [] numbers = {1, 2, 3}; // 이렇게 먼저 쓰는건 가능. 근데 잘 쓰지는 않는 유형 
		 */
		
		for(int i = 0; i < numbers.length; i++) { 	//숫자로 최종값 설정시, 배열 갯.수.가. 일치되도록 작성.
			System.out.println(numbers[i]);
		}
	

	}

}
