package day04;

public class Day04_condition_Test10_1 {

	public static void main(String[] args) {

		int minToSec = 60;
		int hourToSec = minToSec * 60;
		int dayToSec = hourToSec * 24;

		int inTime = 1200;
		int inHour = inTime / 100;
		int inMin = inTime % 100;
		int inTimeSec = inHour * hourToSec + inMin * minToSec;

		int outTime = 1620;
		int outHour = outTime / 100;
		int outMin = outTime % 100;
		int outTimeSec = outHour * hourToSec + outMin * minToSec;

		int second = outTimeSec - inTimeSec;


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