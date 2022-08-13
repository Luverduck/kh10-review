package day10_oop.modifier2;

import java.util.Scanner;

public class Test01_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력한 후 객체의 해당 필드에 입력하는 방법 (입력 순서가 생성자 매개변수 순서가 됨)
		Student a = new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		
		// 출력
		a.print();
	}
}
