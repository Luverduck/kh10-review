package day09_oop.method3;

public class Test01 {

	public static void main(String[] args) {
		
		// 객체 생성
		Student a = new Student();
		a.setting("피카츄", 90, 90, 85);
		
		Student b = new Student();
		b.setting("라이츄", 80, 90, 85);
		
		Student c = new Student();
		c.setting("꼬부기", 100, 90, 90);
		
		// 피카츄의 수학 점수를 변경한다고 할 때
		a.math = 90;
		
		a.print();
		b.print();
		c.print();
	}
}
