package day11_oop.keyword4;

public class Test01 {

	public static void main(String[] args) {
		
		// 1. 11의 제곱
		System.out.println(Robot.square(11));
		
		// 2. 체중 80kg, 키 180cm인 사람의 BMI
		System.out.println(Robot.bmi(80, 180));
		
		// 3. 1999년생의 지하철 요금
		System.out.println(Robot.charge(1999));
		
		// 4. 밑변 5, 높이 7인 삼각형의 넓이
		System.out.println(Robot.triangle(5, 7));
		
		// 5. 반지름 7인 원의 넓이
		System.out.println(Robot.circle(7));
	}
}
