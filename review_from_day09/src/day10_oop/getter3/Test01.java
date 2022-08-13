package day10_oop.getter3;

public class Test01 {

	public static void main(String[] args) {
		
		// 객체 생성
		Student a = new Student("마리오", 1, 90, 80, 70);
		Student b = new Student("루이지", 1, 85, 85, 83);
		Student c = new Student("쿠파", 3, 70, 60, 55);
		
		// 출력
		a.print();
		b.print();
		c.print();
	}
}
