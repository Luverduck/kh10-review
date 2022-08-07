package day09_oop.basic2;

public class Test01 {

	public static void main(String[] args) {
		
		// 브라질 객체 생성 
		Country a = new Country();
		a.rank = 1;
		a.name = "브라질";
		a.score = 1828.45;
		
		// 벨기에 객체 생성
		Country b = new Country();
		b.rank = 2;
		b.name = "벨기에";
		b.score = 1823.45;
		
		// 프랑스 객체 생성
		Country c = new Country();
		c.rank = 3;
		c.name = "프랑스";
		c.score = 1786.15;
		
		// 나라 정보 출력
		a.print();
		b.print();
		c.print();
	}
}
