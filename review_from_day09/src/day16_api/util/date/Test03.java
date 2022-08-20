package day16_api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test03 {

	public static void main(String[] args) {
		
		// 1) 2022년 8월 16일 화
		// Date 생성 (현재 시간)
		Date date = new Date();
		
		// Date의 표기 형식 f1 생성 (SimpleDateFormat를 Format으로 업캐스팅하여 생성)
		Format f1 = new SimpleDateFormat("yyyy년 M월 d일 E");
		
		// Date를 표기 형식 f로 변경한 문자열 반환 - Format 클래스의 .format(Object o) 메소드 호출
		String dateF = f1.format(date);
		
		// 출력
		System.out.println(dateF);
		
		// 2) 오후 12시 2분
		Format f2 = new SimpleDateFormat("a h시 m분");
		System.out.println(f2.format(date));
		
		// 3) 12:02:35
		Format f3 = new SimpleDateFormat("HH:mm:ss");
		System.out.println(f3.format(date));
		
		// 4) 2022-08-16 화 12:02:35
		Format f4 = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		System.out.println(f4.format(date));
	}
}
