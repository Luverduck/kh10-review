package day15_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test04_1 {

	public static void main(String[] args) {
		
		// 생년월일 입력
		Scanner sc = new Scanner(System.in);
		//System.out.print("생년월일 : ");
		//String birth = sc.next();
		String birth = "2020-02-29";
		sc.close();
		
		// 생년월일의 정규 표현식
		// 큰 달(31일까지 있는 달), 작은 달(30일까지 있는 달), 2월(28일까지 있는 달)로 구분
		String regex = "^(19[0-9]{2}|20[0-9]{2})-((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01])|(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)|02-(0[1-9]|1[0-9]|2[0-8]))$";
		
		// 판정
		boolean check = Pattern.matches(regex, birth);
		
		// 출력
		System.out.println("결과 : " + check);
	}
}
