package day15_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test04_2_etc {

	public static void main(String[] args) {

		// 생년월일 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일 : ");
		String birth = sc.next();
		sc.close();
		
		// 생년월일의 정규 표현식
		String regex = null;
		switch(birth.substring(5, 7)) {
		case "02":
			regex = "^(19[0-9]{2}|20[0-9]{2})-(02)-(0[1-9]|1[0-9]|2[0-8])$";
			break;
		case "04": case "06": case "09": case "11":
			regex = "^(19[0-9]{2}|20[0-9]{2})-(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)$";
			break;
		case "01": case "03": case "05": case "07": case "08": case "10": case "12":
			regex = "^(19[0-9]{2}|20[0-9]{2})-(0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01])$";
			break;
		}
		
		// 판정
		boolean check = Pattern.matches(regex, birth);

		// 출력
		System.out.println("결과 : " + check);
	}
}
