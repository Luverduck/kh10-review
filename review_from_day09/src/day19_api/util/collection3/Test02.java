package day19_api.util.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		// 사용자 정보를 저장하기 위한 Map 생성
		Map<String, String> data = new HashMap<>();
		
		// Map에 사용자 정보 입력
		data.put("testuser", "testuser1234");
		data.put("student", "student1234");
		data.put("manager", "manager1234");
		
		// Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("ID : ");
		String idInput = sc.nextLine();
		
		System.out.print("PW : ");
		String pwInput = sc.nextLine();
		
		// 판정 - 문자열을 비교할 때는 반드시 equals를 쓴다
		boolean isLogin = data.containsKey(idInput) && data.get(idInput).equals(pwInput);
		if(isLogin) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
		
		sc.close();
	}
}
