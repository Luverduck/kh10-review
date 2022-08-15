package day14_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 닉네임 생성 규칙의 정규 표현식
		String regex = "^[가-힣0-9]{2,10}$";
		
		// 사용자 입력 닉네임
		String user = sc.next();
		
		// 판정
		boolean check = Pattern.matches(regex, user);
		
		// 출력
		if(check) {
			System.out.println("해당 닉네임 사용 가능");
		}
		else {
			System.out.println("해당 닉네임 사용 불가능");
		}
	}
}
