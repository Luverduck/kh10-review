package day14_api.lang.String;

import java.util.Scanner;

public class Test02_2 {

	public static void main(String[] args) {
		
		// ID, PW 추가 (Member 클래스의 인스턴스로서 추가)
		// 인스턴스로 배열 생성 - 인스턴스도 배열을 생성할 수 있다
		Member[] member = new Member[] {
				new Member("Tester1", "1111"),
				new Member("Tester2", "2222"),
				new Member("Tester3", "3333"),
				new Member("Tester4", "4444")
				};
		
		Scanner sc = new Scanner(System.in);
		
		// 입력
		System.out.print("ID 입력 : ");
		String idInput = sc.next();
		
		System.out.print("PW 입력 : ");
		String pwInput = sc.next();
		
		// 입력 정보를 담고있는 로그인용 인스턴스 생성
		Member user = new Member(idInput, pwInput);
		
		// 판별 - 인스탄스간의 '같다' 비교는 equals로 한다
		boolean check = false;
		for(int i = 0 ; i < member.length ; i ++) {
			if(member[i].equals(user)) {
				check = true;
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