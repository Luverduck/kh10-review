package day13_oop.multi2;

public class Drone implements Electric, Transportation, Flyable {

	// 멤버 필드
	
	// 생성자
	
	// 메소드
	
	// 추상메소드 오버라이딩
	@Override
	public void fly() {
		System.out.println("드론이 비행합니다");
	}

	@Override
	public void move() {
		System.out.println("드론이 이동합니다");
	}

	@Override
	public void on() {
		System.out.println("드론의 전원을 켭니다");
	}

	@Override
	public void off() {
		System.out.println("드론의 전원을 끕니다");
	}
}
