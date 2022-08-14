package day12_oop.inherit8;

public class Warrior extends Player {

	// 멤버 필드

	// 생성자
	public Warrior(String id) {
		super(id);
	}

	// 추상메소드 오버라이딩
	@Override
	public void attack() {
		System.out.println("전사가 칼로 공격합니다!");
	}

	@Override
	public void move() {
		System.out.println("전사가 뛰어서 이동합니다!");
	}
}
