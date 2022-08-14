package day12_oop.inherit6;

// 추상 클래스
public abstract class IOS extends Phone {

	// 멤버 필드
	
	// 생성자 - 최소한 슈퍼 클래스의 생성자 규칙(색상 반드시 입력)을 준수해야 한다
	public IOS(String color) {
		super(color);
	}
	
	// 추상 메소드 - 시리에 대한
	public abstract void siri();
}
