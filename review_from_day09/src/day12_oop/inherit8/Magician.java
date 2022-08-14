package day12_oop.inherit8;

public class Magician extends Player {

	// 멤버 필드

	// 생성자
	public Magician(String id) {
		super(id);
	}

	// 추상메소드 오버라이딩
	@Override
	public void attack() {
		System.out.println("마법사가 마법으로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("마법사가 날아서 이동합니다!");
	}
}
