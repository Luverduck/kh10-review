package day14_api.lang.String;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		// ID, PW
		String id = "khacademy";
		String pw = "student";
		
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("ID 입력 : ");
		String idInput = sc.next();
		
		System.out.print("PW 입력 : ");
		String pwInput = sc.next();
		
		// 판별
		boolean check = idInput.equals(id) && pwInput.equals(pw);
		
		// 출력
		if(check) {
			System.out.println("로그인 성공!");
		}
		else {
			System.out.println("로그인 실패!");
		}
		
		sc.close();
	}
}
