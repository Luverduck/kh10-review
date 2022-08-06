package day03;

import java.lang.*;

public class Day03_condition_Test09 {

	public static void main(String[] args) {

		int now = 2022, birth = 1985;
		int age = now - birth + 1;

		if(age <= 7 || age >= 65) {
			System.out.println("무료");
		}

		else if(age <= 13) {
			System.out.println("450원");
		}

		else if(age <= 19) {
			System.out.println("720원");
		}

		else {
			System.out.println("1250원");
		}

	}

}