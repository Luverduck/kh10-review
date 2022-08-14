package day12_oop.inherit6;

// 추상 클래스(이면서 슈퍼클래스)
public abstract class Phone {

	// 멤버 필드
	protected String telNum;
	protected String color;
	
	// getter & setter
	public String getTelNum() {
		return this.telNum;
	}
	
	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	// 생성자 - 색상(color)는 반드시 입력하도록
	public Phone(String color) {
		this.setColor(color);
	}
	
	// 추상 메소드
	public abstract void call();	// 전화에 대한
	public abstract void sms();		// sms에 대한
}
