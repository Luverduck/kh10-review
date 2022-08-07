package day09_oop.method6;

public class Test01 {

	public static void main(String[] args) {
		
		// 객체 생성
		Commodity a = new Commodity();
		a.setting("참이슬후레쉬", "주류", 1200, true, true);
		
		Commodity b = new Commodity();
		b.setting("클라우드맥주", "주류", 3000, false, true);
		
		Commodity c = new Commodity();
		c.setting("바나나킥", "과자", 1500, false, true);
		
		Commodity d = new Commodity();
		d.setting("허니버터칩", "과자", 1200, true, false);
		
		// 출력
		a.print();
		b.print();
		c.print();
		d.print();
	}
}
