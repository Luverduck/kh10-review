package day04;

import java.lang.*;

public class Day04_condition_Test10 {

	public static void main(String[] args) {

		int second = 150;

		int minToSec = 60;
		int hourToSec = minToSec * 60;
		int dayToSec = hourToSec * 24;

		int time;
		if(second < minToSec) {
			if(second < 10) {
				time = 10;
				System.out.println("방금 전");
			}
			else {
				time = second % minToSec;
				System.out.println(time + "초 전");
			}
		}

		else if(second < hourToSec) {
			time = second / minToSec;
			System.out.println(time + "분 전");
		}

		else if(second < dayToSec) {
			time = second / hourToSec;
			System.out.println(time + "시간 전");
		}

		else {
			time = second / dayToSec;
			System.out.println(time + "일 전");
		}

	}

}