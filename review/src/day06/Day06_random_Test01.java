package day06;

public class Day06_random_Test01 {

	public static void main(String[] args) {
		
			double a = Math.random();						// 1) 생성된 double은 0.0에서 1.0 사이
			
			double b = a * 10;								// 2) 10을 곱하면 0.0xxx...에서 9.0xxx... 사이
			
			int c = (int)b;									// 3) int로 형 변환(소수점 버림)하면 0에서 9 사이
			
			int d = c + 1;									// 4) 1을 더하면 1에서 10 사이
			
			double e = (int)(Math.random() * 10) + 1;		// 5) 1에서 10 사이에서 생성되는 난수
	}
}