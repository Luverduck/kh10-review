package day05;

import java.util.Scanner;

public class Day05_loop_Test14 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//단수 입력
		int input = sc.nextInt();
		
		int countO = 0;		//맞은 갯수
		int countX = 0;		//틀린 갯수
		for(int i = 1 ; i <= 9 ; i ++) {
			System.out.print(input + " X " + i + " = ");
			int answer = sc.nextInt();		//정답 입력
			if(answer == input * i) {
				countO ++;					//정답이라면 countO +1
			}
			else {
				countX ++;					//오답이라면 countX +1
			}
		}
		
		System.out.println("맞은 갯수 : " + countO);
		System.out.println("틀린 갯수 : " + countX);
	}
}
