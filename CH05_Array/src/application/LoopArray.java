package application;

public class LoopArray {
	public static void main(String[] args) {
		// 문자열 타입으로 만든 배열
		String[] animals = {"고양이", "개", "펭귄", "사자", "호랑이"};
//                             0       1      2       3        4
		
	 /* System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]); 
	 */
		
		// for 반복문 인덱스 번호 i로, 배열.length는 배열의 사이즈(크기)를 알려준다, 현재 animals의 길이는 5
		System.out.println(animals.length);
		
		for (int i = 0; i < animals.length; i++) {
			System.out.printf("인덱스 %d번은 %s다 \n", i, animals[i]);
		}	
	}
}
