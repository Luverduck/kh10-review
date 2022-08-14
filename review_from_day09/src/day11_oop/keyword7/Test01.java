package day11_oop.keyword7;

public class Test01 {

	public static void main(String[] args) {
		
		// 객체 생성
		Account a = new Account("유재석", 0.3, 5000000);
		Account b = new Account("강호동", 0.5, 3500000);
		Account c = new Account("신동엽", 0.2, 8000000);
		
		// 정보 출력
		a.print();
		b.print();
		c.print();
	}
}
