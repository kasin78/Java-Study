package integerVariable;

public class Arithmetic {
	public static void main(String[] args) {
		// 숫자 계산
		System.out.println(7 + 3);
		System.out.println(9 / 3);
		
		System.out.println("------------");

		System.out.println(10 / 3); // 정수 10 / 정수 3 = 정수 3
		
		System.out.println("------------");

		System.out.println(10.0 / 3.0);
		System.out.println(9 / 4.0); // 정수/실수 이때 큰 값(바이트) 타입으로 출력
									 // [int = 4바이트, double = 8바이트]
		System.out.println(3 * 4);
		System.out.println(3 * 4.0); // 정수*실수 실수로 결과 출력
		System.out.println(3 - 4);
	}
}
