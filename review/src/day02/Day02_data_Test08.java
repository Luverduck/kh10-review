package day02;

import java.lang.*;

public class Day02_data_Test08 {

	public static void main(String[] args) {
    
		int inHour = 12, inMinute = 40;
    
		int outHour = 16, outMinute = 10;
    
		int inTime = inHour * 60 + inMinute;
		int outTime = outHour * 60 + outMinute;
    
		int totalTime = outTime - inTime;
		int hour = totalTime / 60;
		int minute = totalTime % 60;
    
		int totalCount = totalTime / 10;
    
		int totalPrice = totalCount * 1000;
    
		System.out.println("주차 요금은 다음과 같습니다");
		System.out.println(totalPrice);
		
		System.out.println("주차 시간");
		System.out.println(hour + "시간" + minute + "분");
    
    }	
    
}