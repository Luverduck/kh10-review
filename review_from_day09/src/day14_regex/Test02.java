package day14_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ID 생성 규칙의 정규 표현식
		String regex = "^[a-z][a-z0-9]{7,19}$";
		
		// 사용자 입력 ID
		String user = sc.next();
		
		// 판정
		boolean check = Pattern.matches(regex, user);
		
		// 출력
		if(check) {
			System.out.println("ID 생성 가능");
		}
		else {
			System.out.println("ID 생성 불가능");
		}
	}
}
