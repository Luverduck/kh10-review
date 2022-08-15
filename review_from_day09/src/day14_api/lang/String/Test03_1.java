package day14_api.lang.String;

import java.util.Scanner;

public class Test03_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.println("닉네임을 입력해주세요");
		String nickname = sc.next();
		sc.close();
		
		// 판정
		boolean number = nickname.length() >= 2 && nickname.length() <= 10;
		boolean exclusion = nickname.indexOf("운영자") == -1;
		// .indexOf : 앞에서부터 문자열을 조사해서 특정 String이 포함되어 있으면 그 시작점 index를 반환 (int)
		//			  만약 포함하지 않는다면 -1을 반환
		
		// 출력
		if(number & exclusion) {
			System.out.println("닉네임 설정 완료");
		}
		else {
			System.out.println("잘못된 닉네임 형식입니다");
		}
	}
}
