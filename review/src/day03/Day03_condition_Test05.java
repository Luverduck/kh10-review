package day03;

import java.lang.*;

public class Day03_condition_Test05 {

	public static void main(String[] args) {

		int discount = 10;

		int jjajang = 5000, jjajangCount = 2;
		int champon = 6000, champonCount = 1;

		int totalCount = jjajangCount + champonCount;
		int totalPrice = jjajang * jjajangCount + champon * champonCount;

		int discountedPrice = totalPrice * (100 - discount) / 100;

		if(totalCount >= 3) {
			System.out.println(discountedPrice);
		}

		else {
			System.out.println(totalPrice);
		}
		
	}
	
}
