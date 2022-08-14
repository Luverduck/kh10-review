package day10_oop.keyword4;

public class Robot {

	// 제곱 메소드
	public static int square(int number) {
		return number * number;
	}
	
	// BMI 계산 메소드
	public static double bmi(int weight, int height) {
		return weight / (height / 100.0) / (height / 100.0);
	}
	
	// 지하철 요금
	public static String charge(int birth) {
		int age = 2022 - birth;
		if(age <= 7 && age >= 65) {
			return "무료";
		}
		else if(age <= 13) {
			return "450원";
		}
		else if(age <= 19) {
			return "720원";
		}
		else {
			return "1250원";
		}
	}
	
	// 삼각형 넓이
	public static double triangle(int width, int height) {
		return width * height / 2.0;
	}
	
	// 원의 넓이
	public static double circle(int radius) {
		return radius * radius * 3.14;	// 원주율 파이값 출력 : Math.PI
	}
}
