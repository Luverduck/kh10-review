package day17_api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test07 {

	public static void main(String[] args) {
		
		// List 생성
		List<Integer> list = new ArrayList<>();
		
		// 랜덤 생성
		Random r = new Random();
		
		// 구현
		for(int i = 0 ; i < 6 ; i ++) {
			// 난수 생성
			int numR = r.nextInt(45) + 1;
			
			// List에 입력
			if(list.contains(numR)) {
				i --;
			}
			else {
				list.add(numR);
			}
		}
		
		// 정렬(오름차순)
		Collections.sort(list);
		
		// 출력
		System.out.print("이번주 로또 번호 : ");
		for(int i = 0 ; i < list.size() ; i ++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
