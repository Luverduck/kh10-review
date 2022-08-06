package day04;

import java.lang.*;

public class Day04_condition2_Test04_1 {

	public static void main(String[] args) {
		
		int year = 2100;
		int month = 2;
		
		boolean leap = year % 4 == 0 || year % 100 != 0 || year % 400 == 0;
		
		int day;
		switch(month) {
		case 2:
			if(leap) {
				day = 29;
			}
			else {
				day = 28;
			}
			break;
		case 4: case 6: case 9: case 11:
			day = 30;
			break;
		default :
			day = 31;
			break;
		}
		
		System.out.println(year + "년 " + month + "월은 총 " + day + "일까지 있습니다");
		
	}
	
}