package day05;

import java.util.Scanner;

public class Day05_loop_Test10_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int evenCount = 0;
		int oddCount = 0;
		for(int i = 0 ; i < 10 ; i ++) {
			int input = sc.nextInt();
			if(input % 2 == 0) {
				evenCount ++;
			}
			else {
				oddCount ++;
			}
		}
		
		sc.close();
		
		System.out.println("짝수의 갯수 : " + evenCount);
		System.out.println("홀수의 갯수 : " + oddCount);
	}
}
