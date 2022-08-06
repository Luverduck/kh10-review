package day06;

import java.util.Scanner;
import java.util.Random;

public class Day06_random_Test07 {

	public static void main(String[] args) {
		
		Random r = new Random();
		int selectedNum = r.nextInt(1000) + 1;
		
		System.out.println(selectedNum);
		
		Scanner sc = new Scanner(System.in);
		int count = 0;
		while(true) {
			
			System.out.print("입력(1 ~ 1000) : ");
			int answer = sc.nextInt();
			
			if(selectedNum > answer) {
				count ++;
				System.out.println("다운");
			}
			else if(selectedNum == answer) {
				count ++;
				System.out.println("정답");
				break;
			}
			else {
				count ++;
				System.out.println("업");
			}
		}
		
		System.out.println("정답");
		System.out.println("시도 횟수 : " + count);
	}
}
