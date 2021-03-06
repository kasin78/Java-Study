package Application;

import java.util.Scanner; // java.util 패키지 안에 Scanner 클래스를 불러와서 사용 가능

public class UserInput {
	public static void main(String[] args) {
		// 입력을 받는 클래스
		Scanner scanner = new Scanner(System.in); // 스캐너 객체를 선언 주소는 scanner
		
		System.out.print("정수를 입력해주세요 : ");
		int x = scanner.nextInt(); // 스캐너로 정수 입력을 받아 x에 입력, 실행시 입력을 대기하고 엔터키가 입력되면 종료
		System.out.println(x);
		
		System.out.print("문자열을 입력해주세요 : ");
		// next() : 문자열 띄어지면 띄어지기 전까지만 인식
		// nextLine() : 엔터치기 전까지 입력된 모든 문자열 인식
		String y = scanner.next(); // 스캐너로 문자열 입력을 받아 y에 입력, 실행시 입력을 대기하고 엔터키가 입력되면 종료
		System.out.println(y);

		System.out.print("실수를 입력해주세요 : ");
		double z = scanner.nextDouble();
		System.out.println(z);
		
		System.out.print("온도를 입력해 주세요 : ");
		double C = scanner.nextDouble();
		double F = (C * 9/5) + 32;
		scanner.close();
		System.out.println(F + "F");
		System.out.printf("섭씨 %.1fC는 화씨 %.1fF 이다", C, F);
	}
}
