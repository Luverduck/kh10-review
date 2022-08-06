package day03;

import java.lang.*;

public class Day03_condition_Test04 {


	public static void main(String[] args) {

		int now = 2022;
		int birth = 1995;

		int age = now - birth + 1;

		if(age >= 65 && age <= 7) {
			System.out.println("무임승차의 대상이 맞습니다");
		}

		else {
			System.out.println("무임승차의 대상이 아닙니다");
		}

	}

}