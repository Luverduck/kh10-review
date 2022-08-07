package day09_oop.method6;

public class Commodity {

	// 멤버 필드
	String name;
	String type;
	int price;
	boolean deliveryTF;
	boolean eventTF;	
		
	// 세팅 멤소드
	void setting(String name, String type, int price, boolean deliveryTF, boolean eventTF) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.deliveryTF = deliveryTF;
		this.eventTF = eventTF;
	}
		
	// 출력 메소드
	void print() {
		System.out.println("상품명 : " + this.name);
		System.out.println("상품분류 : " + this.type);
		
		if(this.eventTF) {
			int discounted = this.price * (100 - 10) / 100;
			System.out.println("판매가 : " + discounted  + " (행사중)");
		}
		else {
			System.out.println("판매가 : " + this.price);
		}
		System.out.print("새벽배송 : ");
		if(deliveryTF) {
			System.out.println("가능 (+2500원)");
		}
		else {
			System.out.println("불가능");
		}
		System.out.println();
	}
}
