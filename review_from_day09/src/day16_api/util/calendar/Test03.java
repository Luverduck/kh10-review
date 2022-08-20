package day16_api.util.calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test03 {

	public static void main(String[] args) {
		
		// Calendar의 현재 시간에 대한 인스턴스 생성
		Calendar calendar = Calendar.getInstance();

		// 표기 형식 설정
		Format f = new SimpleDateFormat("yyyy년 M월 dd일");
				
		// 현재 날짜 (확인용)
		Date now = calendar.getTime();
		System.out.println("현재 날짜 : " + f.format(now));
		
		// 현재 시간보다 100일 뒤를 세팅
		int year  = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int day = calendar.get(Calendar.DATE);
		calendar.set(year, month, day + 99);	// 오늘부터 100일 뒤면 오늘을 1일로 치고 계산한다
		
		// 100일 후 날짜
		Date setTime = calendar.getTime();
		System.out.println("100일 후 : " + f.format(setTime));
	}
}
