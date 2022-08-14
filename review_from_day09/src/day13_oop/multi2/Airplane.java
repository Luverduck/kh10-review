package day13_oop.multi2;

public class Airplane implements Transportation, Flyable, Reserve {

	// 멤버 필드
	
	// 생성자
		
	// 메소드
		
	// 추상메소드 오버라이딩
	@Override
	public void reservation() {
		System.out.println("비행기를 예약합니다");
	}

	@Override
	public void fly() {
		System.out.println("비행기가 비행합니다");
	}

	@Override
	public void move() {
		System.out.println("비행기가 이동합니다");
	}
}
