package day04;

import java.lang.*;

public class Day04_condition2_Test03 {

		public static void main(String[] args) {

			int month = 12;

			switch(month) {
			case 2:
				System.out.println("28");
				break;
			case 4: case 6: case 9: case 11:
				System.out.println("30");
				break;
			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
				System.out.println("31");
				break;
			}

		}

	}