package day15_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test04 {

	public static void main(String[] args) {
		
		// 생년월일 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일 : ");
		String birth = sc.next();
		sc.close();
		
		// 생년월일의 정규 표현식
		String regex = "^(19[0-9]{2}|20[0-9]{2})-(0[1-9]|1[0-2])-(0[1-9]|1[0-9]|2[0-9]|3[01])$";
		
		// 판정
		boolean check = Pattern.matches(regex, birth);
		
		// 출력
		System.out.println("결과 : " + check);
	}
}
