package day13_oop.poly2;

public class GalaxyFold3 extends Phone {

	// 멤버 필드
	
	// 생성자
		
	// 메소드
		
	// 추상메소드 오버라이딩
	@Override
	public void camera() {
		System.out.println("GalaxyFold3의 카메라 기능 실행");
	}

	@Override
	public void gallery() {
		System.out.println("GalaxyFold3의 갤러리보기 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("GalaxyFold3의 통화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("GalaxyFold3의 문자 기능 실행");
	}
}
