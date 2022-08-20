package day17_api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test04 {

	public static void main(String[] args) {
		
		// ArrayList 생성
		List<String> list = new ArrayList<>();
		
		// ArrayList에 값 대입
		list.add("자바");
		list.add("파이썬");
		list.add("루비");
		list.add("안드로이드");
		list.add("자바스크립트");
		
		// 랜덤 생성
		Random r = new Random();
		int numR = r.nextInt(list.size());
		
		// 추첨
		System.out.println(list.get(numR));
	}
}
