package day17_api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		 
		// Scanner 생성
		Scanner sc = new Scanner(System.in);
		
		// 사다리 게임에 참여할 인원수 설정
		System.out.print("인원을 입력해주세요 : ");
		int num = sc.nextInt();
		sc.nextLine();		// 반드시 엔터 입력을 제거해줘야 한다
		
		// 이름을 저장하기 위한 List 생성
		List<String> name = new ArrayList<>();
		
		// 행동을 저장하기 위한 List 생성
		List<String> action = new ArrayList<>();
		
		// List에 이름을 입력
		for(int i = 1 ; i <= num ; i ++) {
			System.out.print(i + "번째 이름 : ");
			name.add(sc.nextLine());
		}
		
		// List에 행동을 입력
		for(int i = 1 ; i <= name.size() ; i ++) {
			System.out.print(i + "번째 행동 : ");
			action.add(sc.nextLine());
		}
		
		// 랜덤 사다리를 구현하기 위해 행동이 들어간 List만 셔플
		Collections.shuffle(action);
		
		// 두 List의 index를 맞춰서 출력
		for(int i = 0 ; i < name.size() ; i++) {
			System.out.println(name.get(i) + " : " + action.get(i));
		}
		
		sc.close();
	}
}
