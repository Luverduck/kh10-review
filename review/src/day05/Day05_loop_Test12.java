package day05;

public class Day05_loop_Test12 {
	
	public static void main(String[] args) {
		
		int pushUP = 0;
		for(int i = 1 ; i <= 30 ; i ++) {
			pushUP += 3;
			System.out.println(i +"일의 푸시업 갯수는 " + pushUP + "개 입니다");
		}
		
		System.out.println("30일 동안의 총 푸시업 갯수는 " + pushUP + "개 입니다");
		
	}
}
