package day16_api.util.calendar;

import java.util.Calendar;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		// 사용자 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 입력 : ");
		int year = sc.nextInt();
		System.out.print("월 입력 : ");
		int month = sc.nextInt();
		
		// Calendar 생성
		Calendar calendar = Calendar.getInstance();
		
		// 입력받은 년도, 월의 1일로 설정
		// - Calendar에서 MONTH 값이 0일 때 1월을 나타내므로
		//   월로 입력한 숫자에서 1을 빼야 원하는 달을 지정할 수 있다
		calendar.set(year, month - 1 , 1);	
		
		// 입력받은 년도, 월의 1일이 무슨 요일인지
		// - Calendar에서 DAY_OF_WEEK의 값이 1일 때 일요일을 나타낸다
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);	
		
		// 일요일에 대한 보정 (Calendar.DAY_OF_WEEK가 1이 되도록)
		// 1일이 일요일이 아닐 때 빼야할 값 
		// ex) 일요일(2)일 때 2 - 1 = 1
		calendar.add(Calendar.DATE, - (dayOfWeek - 1));	
		
		// 출력
		System.out.println(year + "년 " + month + "월의 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		// 달력 형태의 출력을 위한 반복문
		for(int i = 0 ; i < 42 ; i ++) {
			if(i % 7 == 0) {
				System.out.println();
			}
			System.out.print(calendar.get(Calendar.DATE) + "\t");
			calendar.add(Calendar.DATE, 1);
		}
	}
}
