package day05;

import java.util.Scanner;

public class Day05_loop_Test10_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int totalCount = 10;
		int evenCount = totalCount;
		for(int i = 0 ; i < totalCount ; i ++) {
			int input = sc.nextInt();
			if(input % 2 != 0) {
				evenCount ++;
			}
		}
		
		sc.close();
		
		System.out.println("짝수의 갯수 : " + evenCount);
		System.out.println("홀수의 갯수 : " + (totalCount - evenCount));
	}
}
