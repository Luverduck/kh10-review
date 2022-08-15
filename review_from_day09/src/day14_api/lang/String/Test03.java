package day14_api.lang.String;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.println("닉네임을 입력해주세요");
		String nickname = sc.next();
		sc.close();
		
		// 판정
		boolean number = nickname.length() >= 2 && nickname.length() <= 10;
		boolean exclusion = !nickname.contains("운영자");		
		// 1) !(부정 연산자) : 포함하지 '않는다'
		// 2) .contains : 특정 String을 포함하는지 여부를 반환 (boolean)
		
		// 출력
		if(number & exclusion) {
			System.out.println("닉네임 설정 완료");
		}
		else {
			System.out.println("잘못된 닉네임 형식입니다");
		}
	}
}
