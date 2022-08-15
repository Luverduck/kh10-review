package day14_api.lang.String;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 초기 제시어
		String now = "바나나";
		System.out.println("제시어 : " + now);
		
		// 남은 횟수
		int count = 3;
		
		while(true) {
			// 다음 입력
			String next = sc.next();
			
			// 판정
			// 1) 글자가 연결되는가
			boolean connection = now.charAt(now.length() - 1) == next.charAt(0);
			// 2) 글자 수가 2글자 이상인가
			boolean number = next.length() >= 2;
			
			// 만약 두 조건을 만족한다면
			if(connection & number) {
				now = next;		// 제시어는 이번 입력이 된다
				System.out.println("성공, 제시어 변경 : " + now);
			}
			
			// 그렇지 않다면
			else {
				count --;		// 남은 횟수 1만큼 감소
				System.out.println("실패, 남은 횟수 :" + count);
			}
			
			// 만약 남은 횟수가 0 이하가 되면
			if(count <= 0) {
				break;			// 구문 탈출
			}
		}
		
		// 게임 오버 메세지 출력
		System.out.println("Game Over!");
		
		sc.close();
	}
}
