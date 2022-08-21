package day19_api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		// 검색어와 해당 검색어의 빈도를 저장하는 Map 생성
		Map<String, Integer> data = new HashMap<>();
		
		// Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		// 반복문
		while(true) {
			// 검색어 입력
			System.out.print("검색어 입력 : ");
			String input = sc.nextLine();
			
			// 검색어를 대문자로 변환 (대소문자 구분 없애기)
			String inputUpper = input.toUpperCase();
			
			// 종료 판정
			if(input.equals("종료")) {
				break;
			}
			
			// 판정
			if(data.containsKey(inputUpper)) {
				data.put(inputUpper, data.get(inputUpper) + 1);
				System.out.println("[" + input + "] " + "검색이 완료되었습니다. 현재 검색횟수 [" + data.get(inputUpper) + "]");
			}
			else {
				data.put(inputUpper, 1);
				System.out.println("[" + input + "] " + "검색이 완료되었습니다. 현재 검색횟수 [" + data.get(inputUpper) + "]");
			}
		}
		
		// 출력
		System.out.println("검색 프로그램을 종료합니다.");
		
		sc.close();
	}
}
