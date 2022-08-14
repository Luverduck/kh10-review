package day12_oop.inherit6;

// 하위 클래스
public class IPhone12 extends IOS {

	// 멤버 필드
	
	// 생성자
	public IPhone12(String color) {
		super(color);
	}
	
	// 메소드
	public void itunes() {
		System.out.println("IPhone12 아이튠즈 실행");
	}
	
	// 추상메소드 오버라이딩
	@Override
	public void siri() {
		System.out.println("IPhone12 시리 실행");
	}

	@Override
	public void call() {
		System.out.println("IPhone12 전화 실행");
	}

	@Override
	public void sms() {
		System.out.println("IPhone12 문자 실행");
	}
}
