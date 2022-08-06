package day05;

import java.util.Scanner;

public class Day05_loop_Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int aliquotCount = 0;
		for(int i = 1 ; i <= input ; i ++) {
			if(input % i == 0) {
				aliquotCount++;
				System.out.println(input + "의 약수는 " + i + " 입니다");
			}
		}
		
		if(aliquotCount == 2) {
			System.out.println(input + "의 약수의 갯수는 " + aliquotCount + "개 입니다");
			System.out.println(input + "은 소수입니다");
		}
		else {
			System.out.println(input + "의 약수의 갯수는 " + aliquotCount + "개 입니다");
			System.out.println(input + "은 소수가 아닙니다");
		}
	}
}
