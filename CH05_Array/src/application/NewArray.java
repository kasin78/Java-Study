package application;

public class NewArray {

	public static void main(String[] args) {
		// new 키워드로 배열을 생성
		// int[] numbers = {}; 초기값을 바로 넣는 방법, 리터럴이라고 한다
		
		int[] numbers; // 정수형 배열 numbers 선언
		numbers = new int[3]; // numbers는 정수형 index 3 크기짜리 배열
		
		numbers[0] = 99;
		numbers[1] = 999;
		numbers[2] = 9999;
		
		int total = 0;
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
			total += numbers[i]; // 모든 배열의 값을 더함
		}
		
		System.out.println("총 합계 : " + total);

	}

}
