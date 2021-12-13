package integerVariable;

public class PrintOutput {
	public static void main(String[] args) {
		// 문자열 + 숫자 => 문자열
		int x = 5;
		int y = 7;
		int z = x + y;
		System.out.println("x + y의 값 : " + z);

		String s = "x + y의 값 : " + z;
		System.out.println(s);

		double a = 3.14;
		double b = 2.16;
		// double 실수 타입

		// int k = a + b;
		// 실수 + 실수 = 정수 // 에러 발생(다른 타입을 더해서 출력할 수 없다)

		double k = a + b;
		System.out.printf("%.2f", k);
	}
}
