package day06;

public class Day06_loop2_Test01 {
	
	public static void main(String[] args) {
		
		for(int min = 0 ; min < 60 ; min ++) {
			
			for(int sec = 0 ; sec < 60 ; sec ++) {
				System.out.println(min + "분 " + sec + "초 지났습니다");
			}
			
		}
	}
}
