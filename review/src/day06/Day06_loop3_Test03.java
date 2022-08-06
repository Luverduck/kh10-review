package day06;

import java.util.Scanner;

public class Day06_loop3_Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		
		int gameCount = 0;
		while(true) {
			int num = sc.nextInt();		//숫자 입력
			gameCount ++;				//입력한 순간 입력 횟수 증가
			input = input - num;		//지정한 숫자에서 입력한 숫자를 차감
			if(input <= 0) {
				break;					//만약 지정한 숫자가 0 이하가 되면 반복문 탈출
			}
		}
		
		System.out.println("Game Over!");
		System.out.println("입력 횟수 : gameCount");
	}
}
