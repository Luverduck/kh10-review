package day09_oop.basic3;

public class Test01 {
	
	public static void main(String[] args) {
		
		// SK 생성
		Telecom a = new Telecom();
		a.tel = "SK";
		a.name = "5G언텍트 52";
		a.price = 52000;
		a.data = 200;
		a.call = 1000;
		a.message = 2000;
		
		// KT 생성
		Telecom b = new Telecom();
		b.tel = "KT";
		b.name = "5G세이브";
		b.price = 45000;
		b.data = 100;
		b.call = 900;
		b.message = 1500;
		
		// LG 생성
		Telecom c = new Telecom();
		c.tel = "LG";
		c.name = "5G세이브";
		c.price = 130000;
		c.data = 500;
		c.call = 2000;
		c.message = 2500;
		
		// 출력
		a.print();
		b.print();
		c.print();
	}
}
