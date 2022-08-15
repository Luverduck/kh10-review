package day14_api.lang.String;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		// 입력
		String text = "신발2수박3시베리아333이이잉44시방";
		
		// 필터링 대상의 배열
		String[] data = new String[] {
				"신발", "수박", "시베리아", "십장생", "개나리", "주옥", "조카", "시방", "된장", "십자수"
				};
		
		// 필터링
		for(int i = 0 ; i < data.length ; i ++) {	// i번째 배열의 욕설이 포함되어있는지 확인
			if(text.contains(data[i])) {			// 만약 i번째 배열의 욕설이 포함되어 있다면
				text = text.replace(data[i], "***");
				// text 문자열에서 해당 욕설을 ***로 바꾸고 
				// 바뀐 text 문자열을 기존 text 문자열에 덮어쓰기 한다
			}
		}
		
		// 출력
		System.out.println(text);
	}
}
