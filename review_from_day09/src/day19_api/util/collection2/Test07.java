package day19_api.util.collection2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test07 {

	public static void main(String[] args) {
		
		// 철수의 Set 생성 및 값 입력
		Set<String> chulsoo = new TreeSet<>();
		chulsoo.add("이상한 나라의 수학자");
		chulsoo.add("더 배트맨");
		chulsoo.add("인민을 위해 복무하라");
		chulsoo.add("블랙라이트");
		
		// 영희의 Set 생성
		Set<String> younghee = new TreeSet<>();
		younghee.add("더 배트맨");
		younghee.add("스파이더맨 : 노웨이 홈");
		younghee.add("블랙라이트");
		younghee.add("우리가 사랑이라고 믿는 것");
		
		// (Q) 둘 다 본 영화
		// 둘 다 본 영화 Set 생성
		Set<String> common = new TreeSet<>();
		common.addAll(chulsoo);
		common.retainAll(younghee);
		System.out.println("둘 다 본 영화 : " + common);
		
		
		// (Q) 둘 중 한명만 본 영화		
		// 1) (A ∪ B) - (A ∩ B)
		Set<String> complement1 = new TreeSet<>();
		complement1.addAll(chulsoo);
		complement1.addAll(younghee);
		complement1.removeAll(common);	// 위에서 구한 common의 원소를 제거
		System.out.println("둘 중 한명만 본 영화 : " + complement1);
		
		// 2) (A - B) ∪ (B - A)
		Set<String> ab = new TreeSet<>();
		ab.addAll(chulsoo);
		ab.removeAll(younghee);
		
		Set<String> ba = new TreeSet<>();
		ba.addAll(younghee);
		ba.removeAll(chulsoo);
		
		Set<String> complement2 = new TreeSet<>();
		complement2.addAll(ab);
		complement2.addAll(ba);
		System.out.println("둘 중 한명만 본 영화 : " + complement2);
	}
}
