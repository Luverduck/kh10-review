package day13_oop.poly2;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 기종 입력
		System.out.print("기종 선택 : ");
		int name = sc.nextInt();
		
		// 기능 입력
		System.out.println("기능 선택 : ");
		int function = sc.nextInt();
		
		// 해당 객체 생성 - 업 캐스팅 : 하위 클래스를 상위 클래스로 보관
		Phone phone;
		if(name == 1) {
			phone = new Galaxy22s();
		}
		else if(name == 2) {
			phone = new GalaxyFold3();
		}
		else if(name == 3) {
			phone = new IPhone12();
		}
		else {
			phone = new IPhone13();
		}
		
		// 기능 실행
		if(function == 1) {
			phone.camera();
		}
		else if(function == 2) {
			phone.gallery();
		}
		else if(function == 3) {
			phone.call();
		}
		else {
			phone.sms();
		}
		
		sc.close();
	}
}
