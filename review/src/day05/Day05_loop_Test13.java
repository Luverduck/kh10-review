package day05;

public class Day05_loop_Test13 {

	public static void main(String[] args) {
		
		long money = 1L;
		for(int i = 1 ; i <= 30 ; i ++) {
			System.out.println(i + "일의 저금액은 " + money + "원 입니다");
			money *= 2;
		}
		
		System.out.println("30일동안 총 저금한 금액은 " + money + "원 입니다");
	}
}
