package day03;

import java.lang.*;

public class Day03_condition_Test07 {
	
	public static void main(String[] args) {

		int pricePerPeopleSpan = 100000;
		int discount = 25;

		int people = 1, travelSpan = 1, travelMonth = 8;

		boolean discountTF = travelMonth == 6 || travelMonth == 8 || travelMonth == 8;

		int price;
		if(discountTF) {
			price = pricePerPeopleSpan * people * (100 - discount) / 100;
		}
		else {
			price = pricePerPeopleSpan * people;
		}

		System.out.println("예상 총 경비는 " + price + "원 입니다");

	}

}