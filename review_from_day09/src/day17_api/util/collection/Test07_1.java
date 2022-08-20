package day17_api.util.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test07_1 {

	public static void main(String[] args) {
		
		// List 생성
		List<Integer> list = new ArrayList<>();
		
		// List에 1부터 45까지 입력
		for(int i = 1 ; i <= 45 ; i ++) {
			list.add(i);
		}
		
		// List 섞기 (Shuffle)
		Collections.shuffle(list);
		
		// 앞에서부터 6개 출력
		System.out.print("이번주 로또 번호 : ");
		for(int i = 0 ; i < 6 ; i ++) {
			System.out.print(list.get(i) + " ");
		}
	}
}
