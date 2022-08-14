package day12_oop.inherit6;

// 하위 클래스
public class Galaxy22s extends Android {

	// 멤버 필드
	
	// 생성자
	public Galaxy22s(String color) {
		super(color);
	}
	
	// 메소드
	public void bixby() {
		System.out.println("Galaxy22s 빅스비 실행");
	}
	
	// 추상메소드 오버라이딩
	@Override
	public void samsungPay() {
		System.out.println("Galaxy22s 삼성페이 실행");
	}

	@Override
	public void call() {
		System.out.println("Galaxy22s 전화 실행");
	}

	@Override
	public void sms() {
		System.out.println("Galaxy22s 문자 실행");
	}
}
