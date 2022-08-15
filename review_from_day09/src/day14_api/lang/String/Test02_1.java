package day14_api.lang.String;

import java.util.Scanner;

public class Test02_1 {

	public static void main(String[] args) {
		
		// ID, PW (배열을 생성하여 값을 직접 입력)
		String[][] user = new String[][] {
			{"Tester1", "1111"},
			{"Tester2", "2222"},
			{"Tester3", "3333"},
			{"Tester4", "4444"},
		};
		
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("ID 입력 : ");
		String idInput = sc.next();
		
		System.out.print("PW 입력 : ");
		String pwInput = sc.next();
		
		// 판별
		boolean check = false;
		for(int i = 0 ; i < user.length ; i ++) {
			check = idInput.equals(user[i][0]) && pwInput.equals(user[i][1]);
			if(check) {
				break;
			}
		}
		
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
