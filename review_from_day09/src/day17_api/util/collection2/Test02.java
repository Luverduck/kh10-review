package day17_api.util.collection2;

import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {

	public static void main(String[] args) {
		
		// Set 생성
		Set<Integer> set = new TreeSet<>();
		
		// Random 생성
		Random r = new Random();
		
		// 구현
		for(int i = 0 ; i < 6 ; i ++) {
			// 난수 생성
			int numR = r.nextInt(45) + 1;
			if(set.contains(numR)) {
				i --;
			}
			else {
				set.add(numR);
			}
		}
		
		// 정렬 (오름차순) - TreeSet은 자동으로 오름차순 정렬한다
		
		// 출력 - Set은 값을 index로 관리하지 않기 때문에 하나씩 출력이 까다롭다
		// 1) Set의 개별 요소를 Iterator(반복자)로 반환하여 출력하기
		System.out.print("이번주 로또 번호 : ");
		Iterator<Integer> iter = set.iterator();
		while(iter.hasNext()) {
			int number = iter.next();
			System.out.print(number + " ");
		}
	}
}
