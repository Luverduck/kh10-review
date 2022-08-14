package day12_oop.inherit6;

// 추상 클래스
public abstract class Android extends Phone {

	// 멤버 필드
	
	// 생성자 - 최소한 슈퍼 클래스의 생성자 규칙(색상 반드시 입력)을 준수해야 한다
	public Android(String color) {
		super(color);
	}
	
	// 추상 메소드 - 삼성페이에 대한
	public abstract void samsungPay();
}
