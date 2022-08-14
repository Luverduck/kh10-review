package day12_oop.inherit6;

// 하위 클래스
public class GalaxyFold3 extends Android {

	// 멤버 필드
	
	// 생성자
	public GalaxyFold3(String color) {
		super(color);
	}
	
	// 메소드
	public void iris() {
		System.out.println("GalaxyFold3 홍채인식 실행");
	}
	
	// 추상메소드 오버라이딩
	@Override
	public void samsungPay() {
		System.out.println("GalaxyFold3 삼성페이 실행");
	}

	@Override
	public void call() {
		System.out.println("GalaxyFold3 통화 실행");
	}

	@Override
	public void sms() {
		System.out.println("GalaxyFold3 문자 실행");
	}
}
