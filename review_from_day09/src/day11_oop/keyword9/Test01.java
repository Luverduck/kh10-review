package day11_oop.keyword9;

import java.util.Scanner;
 
public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 사용자 입력
		String id = sc.next();
		String pw = sc.next();
		String nickname = sc.next();
		
		// 객체 생성
		User a = new User(id, pw, nickname);
		
		// 출력
		a.print();
	}
}
