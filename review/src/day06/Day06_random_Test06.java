package day06;

import java.util.Random;

public class Day06_random_Test06 {

	public static void main(String[] args) {
		
		Random r = new Random();
	
		int diceCount = 0;
		while(true) {
			int first = r.nextInt(6) + 1;
			int second = r.nextInt(6) + 1;
		
			boolean five = first == 5 && second == 6;
			boolean six = first == 6 && second == 6;
		
			if(five || six) {
				diceCount += 0;
				break;
			}
			else {
				diceCount ++;
			}
		}
		
		System.out.println("무인도 탈출 성공");
		System.out.println("총 던진 주사위의 수 : " + diceCount);
	}
}
