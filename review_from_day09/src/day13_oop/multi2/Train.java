package day13_oop.multi2;

public class Train implements Transportation, Reserve {

	// 멤버 필드
	
	// 생성자
		
	// 메소드
		
	// 추상메소드 오버라이딩
	@Override
	public void reservation() {
		System.out.println("기차를 예약합니다");
	}

	@Override
	public void move() {
		System.out.println("기차가 이동합니다");
	}
}
