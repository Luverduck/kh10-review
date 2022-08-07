package day09_oop.method5;

public class Phone {

	// 멤버 필드
	String name;
	String tel;
	int price;
	int duration;
	
	// 세팅 멤소드
	void setting(String name, String tel, int price, int duration) {
		this.name = name;
		this.tel = tel;
		this.price = price;
		this.duration = duration;
	}
	
	// 출력 메소드
	void print() {
		System.out.println("이름 : " + this.name);
		System.out.println("통신사 : " + this.tel);
		
		if(this.duration == 0) {
			System.out.println("가격 : " + (this.price * (100 - 5) / 100) + " (약정없음)");
		}
		else {
			int installment = this.price / this.duration;
			System.out.println("가격 : " + this.price + " (예상할부금 : " + installment + ")");
		}
		System.out.println("약정 개월 : " + this.duration);
		System.out.println();
	}
}
