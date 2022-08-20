package day17_api.util.collection2;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test03 {

	public static void main(String[] args) {
		
		// 글 번호를 저장하는 Set 생성
		Set<Integer> set = new TreeSet<>();
		
		// Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			// 입력
			System.out.print("글 번호 입력 : ");
			int textNum = sc.nextInt();
			sc.nextLine();
			
			// 종료 조건
			if(textNum == 0) {
				break;
			}
			
			// 판정
			if(set.contains(textNum)) {
				set.remove(textNum);
				System.out.println(textNum +"번 글에 좋아요를 취소했습니다");
			}
			else {
				set.add(textNum);
				System.out.println(textNum + "번 글에 좋아요를 눌렀습니다");
			}
		}
		
		// 1) Iterator를 활용한 Set의 요소 출력
		System.out.print("좋아요를 누른 글 번호 : ");
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			int number = iter.next();
			System.out.println(number);
		}
		
		sc.close();
	}
}
