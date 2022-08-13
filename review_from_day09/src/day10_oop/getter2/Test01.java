package day10_oop.getter2;

public class Test01 {
 
	public static void main(String[] args) {
		
		// 객체 생성
		Student a = new Student("피카츄", "응용SW기초기술활용", 50, 60);
		Student b = new Student("라이츄", "응용SW기초기술활용", 40, 80);
		Student c = new Student("파이리", "프로그래밍언어", 60, 65);
		
		// 출력
		a.print();
		b.print();
		c.print();
	}
}
