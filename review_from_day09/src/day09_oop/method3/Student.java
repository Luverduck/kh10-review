package day09_oop.method3;

public class Student {

	// 멤버 필드
	String name;
	int korean;
	int english;
	int math;
	
	// 세팅 메소드
	void setting(String name, int korean, int english, int math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}
	
	// 출력 메소드
	void print() {
		int sum = this.korean + this.english + this.math;
		int avg = sum / 3;
		System.out.println("이름 : " + this.name);
		System.out.println("국어 : " + this.korean);
		System.out.println("영어 : " + this.english);
		System.out.println("수학 : " + this.math);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println();
	}
}
