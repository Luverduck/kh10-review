package day12_oop.inherit6;

// 하위 클래스
public class IPhone13 extends IOS {

	// 멤버 필드
	
	// 생성자
	public IPhone13(String color) {
		super(color);
	}
	
	// 메소드
	public void faceTime() {
		System.out.println("IPhone13 영상통화 실행");
	}
	
	// 추상메소드 오버라이딩
	@Override
	public void siri() {
		System.out.println("IPhone13 시리 실행");
	}

	@Override
	public void call() {
		System.out.println("IPhone13 통화 실행");
	}

	@Override
	public void sms() {
		System.out.println("IPhone13 문자 실행");
	}
}
