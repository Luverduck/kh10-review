package day15_regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test04_2 {

	public static void main(String[] args) {
		
		// 생년월일 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("생년월일 : ");
		String birth = sc.next();
		sc.close();
		
		// 생년월일의 정규 표현식 - 윤년을 고려하는 경우
		// 입력에서 년도만 추출 : (birth.substring(0, 4)
		// 추출한 년도를 숫자로 변환 : Integer.parseInt(birth.substring(0, 4))
		int yearValue = Integer.parseInt(birth.substring(0, 4));	
		
		// 윤년 판정
		// 년도가 4의 배수이면 윤년 O
		// 년도가 4의 배수이면서 100의 배수이면 윤년 X
		// -> 년도가 4의 배수이면서(&&) 100의 배수가 아니면 윤년 O
		// 년도가 4의 배수이면서 100의 배수이지만 400의 배수이면(||) 윤년 O
		boolean leap = yearValue % 4 == 0 && yearValue % 100 != 0 || yearValue % 400 == 0;
		
		// 윤년일 때와 윤년이 아닐 때의 정규 표현식
		String regex;
		if(leap) {
			regex = "^(19[0-9]{2}|20[0-9]{2})-((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01])|(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)|02-(0[1-9]|1[0-9]|2[0-9]))$";
		}
		else {
			regex = "^(19[0-9]{2}|20[0-9]{2})-((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01])|(0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30)|02-(0[1-9]|1[0-9]|2[0-8]))$";
		}
		
		// 판정
		boolean check = Pattern.matches(regex, birth);
		
		// 출력
		System.out.println("결과 : " + check);
	}
}