package day03;

import java.lang.*;

public class Day03_condition_Test06 {

	public static void main(String[] args) {

		int finePerTenKm = 10000;
		int initialFine = 30000;

		int v = 300;
		int limitV = 50;

		int over = v - limitV;
		int overCount = over / 10;
		
		boolean overTF = v >= limitV;

		int fine;
		if(overTF) {
			fine = initialFine + finePerTenKm * overCount;
			if(fine >= 70000) {
				fine = 70000;
			}
		}

		else {
			fine = 0;
		}

		System.out.println("벌금은 " + fine + "원 입니다");

	}

}