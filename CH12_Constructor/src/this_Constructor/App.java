package this_Constructor;

public class App {

	public static void main(String[] args) {
		// this 생성자
		Person p1 = new Person();
		System.out.println(p1);
		
		Person p2 = new Person("라이언");
		System.out.println(p2);
		
		Person p3 = new Person("홍길동", 18);
		System.out.println(p3);
	}

}
