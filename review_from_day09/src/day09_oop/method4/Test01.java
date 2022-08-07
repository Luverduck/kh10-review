package day09_oop.method4;

public class Test01 {

	public static void main(String[] args) {
		
		// 객체 생성
		Menu a = new Menu();
		a.setting("아메리카노", "음료", 2500, true);
		
		Menu b = new Menu();
		b.setting("모카라떼", "음료", 3500, false);
		
		Menu c = new Menu();
		c.setting("치즈케이크", "디저트", 5000, true);
		
		Menu d = new Menu();
		d.setting("마카롱", "디저트", 3000, false);
		
		// 출력
		a.print();
		b.print();
		c.print();
	}
}
