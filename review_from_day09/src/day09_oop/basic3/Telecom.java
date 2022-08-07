package day09_oop.basic3;

public class Telecom {

	// 멤버 필드 
	String tel;
	String name;
	int price;
	int data;
	int call;
	int message;
	
	// 출력 메소드 
	void print() {
		System.out.println("통신사 : " + this.tel);
		System.out.println("상품명 : " + this.name);
		System.out.println("월정액" + this.price);
		System.out.println("데이터(GB) : " + this.data);
		System.out.println("통화(분) : " + this.call);
		System.out.println("문자(건) : " + this.message);
		System.out.println();
	}
}
