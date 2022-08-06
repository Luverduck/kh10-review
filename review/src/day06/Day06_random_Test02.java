package day06;

import java.util.Random;

public class Day06_random_Test02 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		// 1. 주사위
		int dice = r.nextInt(6) + 1;
		System.out.println(dice);
		
		// 2. 로또 번호 1개 추첨 (1~45)
		int lotto = r.nextInt(45) + 1;
		System.out.println(lotto);
		
		// 3-1. OTP 번호 생성 (6자리 정수 - 000000 ~ 999999)
		int otpZero = r.nextInt(1000000);
		System.out.println(otpZero);
		
		// 3-2. OTP 번호 생성 (6자리 정수 - 100000 ~ 999999)
		int otp = r.nextInt(900000) + 100000;
		System.out.println(otp);
		
		// 4. 동전 1개를 던졌을 때 결과
		boolean coin = r.nextBoolean();
		if(coin) {
			System.out.println("앞");
		}
		else {
			System.out.println("뒤");
		}
	}
}
