package day10_oop.modifier2;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자 입력
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.println();
		
		System.out.print("국어 점수 : ");
		int level = sc.nextInt();
		System.out.println();
		
		System.out.print("국어 점수 : ");
		int korean = sc.nextInt();
		System.out.println();
		
		System.out.print("영어 점수 : ");
		int english = sc.nextInt();
		System.out.println();
		
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		System.out.println();
		
		// 객체 생성
		Student a = new Student(name, level, korean, english, math);
		
		// 출력
		a.print();
	}
}
