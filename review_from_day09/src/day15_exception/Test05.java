package day15_exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test05 {

	public static void main(String[] args) {

		// 입력 조건에 대한 정규 표현식
		String regexName = "^[가-힣]{2,7}$";
		String regexKorean = "^(0-9|1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9]|100)$";
		String regexMath = "^(0-9|1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9]|100)$";
		String regexEnglish = "^(0-9|1[0-9]|2[0-9]|3[0-9]|4[0-9]|5[0-9]|6[0-9]|7[0-9]|8[0-9]|9[0-9]|100)$";

		Scanner sc = new Scanner(System.in);
		
		try {
			// 입력
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 점수 : ");
			String korean = sc.next();
			System.out.print("수학 점수 : ");
			String math = sc.next();
			System.out.print("영어 점수 : ");
			String english = sc.next();
			
			// 판정
			boolean nameTF = Pattern.matches(regexName, name);
			boolean scoreTF = Pattern.matches(regexKorean, korean) && Pattern.matches(regexMath, math) && Pattern.matches(regexEnglish, english);
			
			// 출력
			if(nameTF && scoreTF) {	// 입력 조건을 만족한다면
				// 총점, 평균
				int sum = Integer.parseInt(korean) + Integer.parseInt(math) + Integer.parseInt(english);
				double avg = sum / 3.0;
				
				// 출력
				System.out.println("이름 : " + name);
				System.out.println("총점 : " + sum);
				System.out.println("평균 : " + avg);
			}
			
			else {
				// 의도적으로 error를 만들어서 catch문으로 도달할 수 있도록 한다
				// 1) 정수 1개를 추출한다 (예외를 강제로 일으키기 위함이므로 국어, 영어, 수학 성적중 아무거나 상관없다)
				int errorMaker = Integer.parseInt(korean);
				
				// 2) 예외를 발생시키기 위해 추출한 정수를 0으로 나눈다 (강제로 에러를 발생시키는 방법 - 0으로 나누기)
				int error = errorMaker / 0;
			}
		}
		
		catch(Exception e) {
			System.err.println("잘못된 입력입니다. 처음부터 다시 진행해주세요");
			System.exit(1);
		}
		
		sc.close();
	}
}
