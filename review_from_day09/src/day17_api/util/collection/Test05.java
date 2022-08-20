package day17_api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		// List 생성
		List<String> list = new ArrayList<>();
		
		// Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		// 구현
		while(true) {
			System.out.print("나라이름 입력 : ");
			String input = sc.nextLine();
			
			if(list.contains(input)) {
				break;
			}
			
			else {
				list.add(input);
			}
		}
		
		// 출력
		System.out.print("지금까지 입력한 나라 : ");
		for(int i = 0 ; i < list.size() ; i ++) {
			System.out.print(list.get(i) + " ");
		}		
		sc.close();
	}
}
