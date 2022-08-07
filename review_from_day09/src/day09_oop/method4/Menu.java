package day09_oop.method4;

public class Menu {

	// 멤버 필드
	String name;
	String type;
	int price;
	boolean eventTF;
	
	// 설정 메소드
	void setting(String name, String type, int price, boolean eventTF) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.eventTF = eventTF;
	}
	
	// 출력 메소드
	void print() {
		System.out.println("이름 : "+ this.name);
		System.out.println("구분 : " + this.type);
		System.out.println("가격 : " + this.price);
		System.out.print("행사 여부 : ");
		if(this.eventTF) {
			System.out.print("행사중");
		}
		else {
			System.out.print("-");
		}
		System.out.println();
		System.out.println();
	}
}
