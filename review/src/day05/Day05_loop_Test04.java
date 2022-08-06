package day05;

import java.util.Scanner;

public class Day05_loop_Test04 {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner sc = new Scanner(System.in);
		
		//준비 - 분, 초 세팅
		int min = sc.nextInt();
		int sec = sc.nextInt();
		int totalSec = min * 60 + sec;
		
		//출력
		for(int i = totalSec ; i >= 0 ; i --) {
			System.out.println((i / 60) + "분 " + (i % 60) + "초 남았습니다");
			Thread.sleep(1000L);
		}
		
		sc.close();
	}
}
